package com.gbs.compliance.susep.repository;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.inject.Inject;
import com.gbs.compliance.susep.model.SusepEventStatus;

@Named("susepEventStatus")
public class SusepEventStatusRepository extends AbstractRepository<SusepEventStatus, Long> {

    @Inject
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SusepEventStatusRepository() {
        super(SusepEventStatus.class);
    }
}
