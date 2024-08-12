package dev.bengi.userservice.config;

import org.bouncycastle.crypto.generators.BCrypt;
import org.modelmapper.Conditions;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Configuration class for bean definitions.
 *
 * @author Bengi
 */
@Configuration
public class BeanConfig {

    /**
     * Creates a ModelMapper bean with a loose matching strategy and a property condition to ignore null values.
     *
     * @return a ModelMapper instance
     */
    @Bean
    public ModelMapper modelMapper() {
        // Create a new ModelMapper instance
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.LOOSE)

                // Set a property condition to ignore null values
                .setPropertyCondition(Conditions.isNotNull());

        return modelMapper;
    }

    /**
     * Creates a BCryptPasswordEncoder bean for password encoding.
     *
     * @return a BCryptPasswordEncoder instance
     */
    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        // Create a new BCryptPasswordEncoder instance
        return new BCryptPasswordEncoder();
    }
}