package com.monedafrontera.dao;
// Generated 5/11/2015 11:46:51 AM by Hibernate Tools 4.3.1.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

import com.monedafrontera.dto.Bindb;

/**
 * Home object for domain model class Bindb.
 * @see com.monedafrontera.dto.Bindb
 * @author Hibernate Tools
 */
public class BindbHome extends BaseHibernateDAO{

	private static final Log log = LogFactory.getLog(BindbHome.class);

	public void persist(Bindb transientInstance) {
		log.debug("persisting Bindb instance");
		try {
			this.getSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Bindb instance) {
		log.debug("attaching dirty Bindb instance");
		try {
			this.getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Bindb instance) {
		log.debug("attaching clean Bindb instance");
		try {
			this.getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Bindb persistentInstance) {
		log.debug("deleting Bindb instance");
		try {
			this.getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Bindb merge(Bindb detachedInstance) {
		log.debug("merging Bindb instance");
		try {
			Bindb result = (Bindb) this.getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Bindb findById(java.lang.String id) {
		log.debug("getting Bindb instance with id: " + id);
		try {
			Bindb instance = (Bindb) this.getSession().get("com.monedafrontera.dto.Bindb", id);
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

	public List findByExample(Bindb instance) {
		log.debug("finding Bindb instance by example");
		try {
			List results = this.getSession().createCriteria("com.monedafrontera.dto.Bindb")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
