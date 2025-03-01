package org.openmrs.module.mycarehub.api.db.hibernate;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.openmrs.api.db.hibernate.DbSession;
import org.openmrs.api.db.hibernate.DbSessionFactory;
import org.openmrs.module.mycarehub.api.db.MyCareHubRedFlagDao;
import org.openmrs.module.mycarehub.model.RedFlags;

import java.util.Date;
import java.util.List;

public class HibernateMyCareHubRedFlagDao implements MyCareHubRedFlagDao {
	
	private DbSessionFactory sessionFactory;
	
	public HibernateMyCareHubRedFlagDao(DbSessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public List<RedFlags> getAllRedFlagRequests() {
		Criteria criteria = session().createCriteria(RedFlags.class);
		criteria.add(Restrictions.eq("retired", false));
		return criteria.list();
	}
	
	@Override
	public List<RedFlags> getAllRedFlagRequestsByLastSyncDate(Date lastSyncDate) {
		Criteria criteria = session().createCriteria(RedFlags.class);
		criteria.add(Restrictions.eq("retired", false));
		criteria.add(Restrictions.or(Restrictions.ge("progressDate", lastSyncDate),
		    Restrictions.ge("dateResolved", lastSyncDate)));
		return criteria.list();
	}
	
	@Override
	public List<RedFlags> saveRedFlagRequests(List<RedFlags> redFlags) {
		session().saveOrUpdate(redFlags);
		return redFlags;
	}
	
	@Override
	public RedFlags getRedFlagRequestByMycarehubId(String mycarehubId) {
		Criteria criteria = session().createCriteria(RedFlags.class);
		criteria.add(Restrictions.eq("mycarehubId", mycarehubId));
		return (RedFlags) criteria.uniqueResult();
	}
	
	private DbSession session() {
		return sessionFactory.getCurrentSession();
	}
	
}
