package com.gbs.compliance.susep.repository;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.inject.Inject;
import com.gbs.compliance.susep.model.User;

@Named("user")
public class UserRepository extends AbstractRepository<User, Long> {

    @Inject
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UserRepository() {
        super(User.class);
    }
}
