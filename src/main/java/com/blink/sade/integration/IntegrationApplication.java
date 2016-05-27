package com.blink.sade.integration;
import io.dropwizard.Application;
import io.dropwizard.assets.AssetsBundle;
import io.dropwizard.auth.AuthDynamicFeature;
import io.dropwizard.auth.AuthValueFactoryProvider;
import io.dropwizard.auth.basic.BasicCredentialAuthFilter;
import io.dropwizard.configuration.EnvironmentVariableSubstitutor;
import io.dropwizard.configuration.SubstitutingSourceProvider;
import io.dropwizard.db.DataSourceFactory;
import io.dropwizard.hibernate.HibernateBundle;
import io.dropwizard.migrations.MigrationsBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.dropwizard.views.ViewBundle;

import java.util.Map;

import org.glassfish.jersey.server.filter.RolesAllowedDynamicFeature;

import com.blink.sade.integration.auth.ExampleAuthenticator;
import com.blink.sade.integration.auth.ExampleAuthorizer;
import com.blink.sade.integration.cli.RenderCommand;
import com.blink.sade.integration.core.Person;
import com.blink.sade.integration.core.Template;
import com.blink.sade.integration.core.User;
import com.blink.sade.integration.db.PersonDAO;
import com.blink.sade.integration.filter.DateRequiredFeature;
import com.blink.sade.integration.health.AdminDocumentosDeTrabajoHealthCheck;
import com.blink.sade.integration.health.ConsultarEEHealthCheck;
import com.blink.sade.integration.health.ConsultarUsuarioSADEHealthCheck;
import com.blink.sade.integration.health.GeneraGEDOHealthCheck;
import com.blink.sade.integration.health.GenerarPaseHealthCheck;
import com.blink.sade.integration.health.GenerarTareaGEDOHealthCheck;
import com.blink.sade.integration.health.VincularGEDOEEHealthCheck;
import com.blink.sade.integration.resources.ExpedienteResource;
import com.blink.sade.integration.resources.FilteredResource;
import com.blink.sade.integration.resources.HelloWorldResource;
import com.blink.sade.integration.resources.PeopleResource;
import com.blink.sade.integration.resources.PersonResource;
import com.blink.sade.integration.resources.ProtectedResource;
import com.blink.sade.integration.resources.ViewResource;

public class IntegrationApplication extends Application<IntegrationConfiguration> {
    public static void main(String[] args) throws Exception {
        new IntegrationApplication().run(args);
    	// new IntegrationApplication().run(new String[] {"server", "example.yml"});
    }

    private final HibernateBundle<IntegrationConfiguration> hibernateBundle =
            new HibernateBundle<IntegrationConfiguration>(Person.class) {
                @Override
                public DataSourceFactory getDataSourceFactory(IntegrationConfiguration configuration) {
                    return configuration.getDataSourceFactory();
                }
            };

    @Override
    public String getName() {
        return "Sade Integration Platform - Blink";
    }

    @Override
    public void initialize(Bootstrap<IntegrationConfiguration> bootstrap) {
        // Enable variable substitution with environment variables
        bootstrap.setConfigurationSourceProvider(
                new SubstitutingSourceProvider(
                        bootstrap.getConfigurationSourceProvider(),
                        new EnvironmentVariableSubstitutor(false)
                )
        );

        bootstrap.addCommand(new RenderCommand());
        bootstrap.addBundle(new AssetsBundle());
        bootstrap.addBundle(new MigrationsBundle<IntegrationConfiguration>() {
            @Override
            public DataSourceFactory getDataSourceFactory(IntegrationConfiguration configuration) {
                return configuration.getDataSourceFactory();
            }
        });
        bootstrap.addBundle(hibernateBundle);
        bootstrap.addBundle(new ViewBundle<IntegrationConfiguration>() {
            @Override
            public Map<String, Map<String, String>> getViewConfiguration(IntegrationConfiguration configuration) {
                return configuration.getViewRendererConfiguration();
            }
        });
    }

    @Override
    public void run(IntegrationConfiguration configuration, Environment environment) {
        final PersonDAO dao = new PersonDAO(hibernateBundle.getSessionFactory());
        final Template template = configuration.buildTemplate();

        //environment.healthChecks().register("template", new TemplateHealthCheck(template));
        environment.healthChecks().register("1 - GenerarDocumentoGEDO ", new GeneraGEDOHealthCheck());
        environment.healthChecks().register("2 - VincularGEDOEEHealthCheck ", new VincularGEDOEEHealthCheck());
        environment.healthChecks().register("5 - 6 - consultaEE () y consultaEEDetallado() EX-2015-00644292-   -MGEYA-DGDAI", new ConsultarEEHealthCheck());
        environment.healthChecks().register("7 - GenerarTareaGEDOHealthCheck ", new GenerarTareaGEDOHealthCheck());
        environment.healthChecks().register("8 - ConsultarUsuarioSADEHealthCheck ", new ConsultarUsuarioSADEHealthCheck());
        environment.healthChecks().register("9 - AdminDocumentosDeTrabajoHealthCheck ", new AdminDocumentosDeTrabajoHealthCheck());
        environment.healthChecks().register("10 - GenerarPaseHealthCheck ", new GenerarPaseHealthCheck());
        
        
        
        
        
        environment.jersey().register(DateRequiredFeature.class);
        environment.jersey().register(new AuthDynamicFeature(new BasicCredentialAuthFilter.Builder<User>()
                .setAuthenticator(new ExampleAuthenticator())
                .setAuthorizer(new ExampleAuthorizer())
                .setRealm("SUPER SECRET STUFF")
                .buildAuthFilter()));
        environment.jersey().register(new AuthValueFactoryProvider.Binder<>(User.class));
        environment.jersey().register(RolesAllowedDynamicFeature.class);
        environment.jersey().register(new HelloWorldResource(template));
        environment.jersey().register(new ViewResource());
        environment.jersey().register(new ExpedienteResource());
        environment.jersey().register(new ProtectedResource());
        environment.jersey().register(new PeopleResource(dao));
        environment.jersey().register(new PersonResource(dao));
        environment.jersey().register(new FilteredResource());
    }
}
