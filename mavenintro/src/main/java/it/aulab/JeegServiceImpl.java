package it.aulab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

// @Component("jeegService")
@Service("jeegService")
public class JeegServiceImpl implements JeegService{

    @Autowired
    private JeegRepository repository;

    //Se c'è la dependency injection non abbiamo bisogno di meccanismi di get e set
    // public JeegRepository getRepository() {
    //     return repository;
    // }
    // public void setRepository(JeegRepository repository) {
    //     this.repository = repository;
    // }

    @Override
    public void attack() {
            Jeeg jeeg = this.repository.getJeeg();
            Arm armSx = jeeg.getArmSx();
            Arm armDx = jeeg.getArmDx();
            armSx.attack();
            armDx.attack();
    }

    @Override
    public void move() {
            Jeeg jeeg = this.repository.getJeeg();
            Leg legSx = jeeg.getLegSx();
            Leg legDx = jeeg.getLegDx();
            legSx.walkBackward();
            legDx.walkForward();
    }

}
