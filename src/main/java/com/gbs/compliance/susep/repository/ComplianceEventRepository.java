package com.gbs.compliance.susep.repository;

import javax.persistence.EntityManager;
import javax.inject.Inject;
import com.gbs.compliance.susep.model.ComplianceEvent;

public class ComplianceEventRepository extends AbstractRepository<ComplianceEvent, Long> {

    @Inject
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ComplianceEventRepository() {
        super(ComplianceEvent.class);
    }
}
