package it.aulab;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("it.aulab")
public class AppConfig {
        @Bean(name = "jeeg")
        public Jeeg getJeeg(){
                System.out.println("Creazione del jeeg");
                return new Jeeg(getArmSx(), getArmDx(), getLegSx(), getLegDx());
        }
        
        @Bean(name = "armSx")
        // @Scope("prototype")
        public Arm getArmSx(){
                System.out.println("Creazione dell'arm sx");
                return new Arm(Side.SX);
        }
        @Bean(name = "armDx")
        public Arm getArmDx(){
                System.out.println("Creazione dell'arm dx");
                return new Arm(Side.DX);
        }
        @Bean(name = "legSx")
        public Leg getLegSx(){
                System.out.println("Creazione del leg sx");
                return new Leg(Side.SX);
        }
        @Bean(name = "legDx")
        public Leg getLegDx(){
                System.out.println("Creazione del leg dx");
                return new Leg(Side.DX);
        }
        
}
