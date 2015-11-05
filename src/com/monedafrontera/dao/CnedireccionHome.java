package com.monedafrontera.dao;
// Generated 5/11/2015 11:46:51 AM by Hibernate Tools 4.3.1.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

import com.monedafrontera.dto.Cnedireccion;

/**
 * Home object for domain model class Cnedireccion.
 * @see com.monedafrontera.dto.Cnedireccion
 * @author Hibernate Tools
 */
public class CnedireccionHome extends BaseHibernateDAO{

	private static final Log log = LogFactory.getLog(CnedireccionHome.class);

	public void persist(Cnedireccion transientInstance) {
		log.debug("persisting Cnedireccion instance");
		try {
			this.getSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Cnedireccion instance) {
		log.debug("attaching dirty Cnedireccion instance");
		try {
			this.getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Cnedireccion instance) {
		log.debug("attaching clean Cnedireccion instance");
		try {
			this.getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Cnedireccion persistentInstance) {
		log.debug("deleting Cnedireccion instance");
		try {
			this.getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Cnedireccion merge(Cnedireccion detachedInstance) {
		log.debug("merging Cnedireccion instance");
		try {
			Cnedireccion result = (Cnedireccion) this.getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Cnedireccion findById(java.lang.String id) {
		log.debug("getting Cnedireccion instance with id: " + id);
		try {
			Cnedireccion instance = (Cnedireccion) this.getSession()
					.get("com.monedafrontera.dto.Cnedireccion", id);
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

	public List findByExample(Cnedireccion instance) {
		log.debug("finding Cnedireccion instance by example");
		try {
			List results = this.getSession().createCriteria("com.monedafrontera.dto.Cnedireccion")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
