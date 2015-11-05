package com.monedafrontera.dao;
// Generated 5/11/2015 11:46:51 AM by Hibernate Tools 4.3.1.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

import com.monedafrontera.dto.Vistasaldomartes;
import com.monedafrontera.dto.VistasaldomartesId;

/**
 * Home object for domain model class Vistasaldomartes.
 * @see com.monedafrontera.dto.Vistasaldomartes
 * @author Hibernate Tools
 */
public class VistasaldomartesHome {

	private static final Log log = LogFactory.getLog(VistasaldomartesHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Vistasaldomartes transientInstance) {
		log.debug("persisting Vistasaldomartes instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Vistasaldomartes instance) {
		log.debug("attaching dirty Vistasaldomartes instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Vistasaldomartes instance) {
		log.debug("attaching clean Vistasaldomartes instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Vistasaldomartes persistentInstance) {
		log.debug("deleting Vistasaldomartes instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Vistasaldomartes merge(Vistasaldomartes detachedInstance) {
		log.debug("merging Vistasaldomartes instance");
		try {
			Vistasaldomartes result = (Vistasaldomartes) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Vistasaldomartes findById(com.monedafrontera.dto.VistasaldomartesId id) {
		log.debug("getting Vistasaldomartes instance with id: " + id);
		try {
			Vistasaldomartes instance = (Vistasaldomartes) sessionFactory.getCurrentSession()
					.get("com.monedafrontera.dto.Vistasaldomartes", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Vistasaldomartes instance) {
		log.debug("finding Vistasaldomartes instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria("com.monedafrontera.dto.Vistasaldomartes")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
