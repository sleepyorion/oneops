/*
 * This file is generated by jOOQ.
*/
package com.oneops.crawler.jooq.cms.routines;


import com.oneops.crawler.jooq.cms.Kloopzcm;

import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MdDeleteRelationAttribute extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = -1668216349;

    /**
     * The parameter <code>kloopzcm.md_delete_relation_attribute.p_attr_id</code>.
     */
    public static final Parameter<Integer> P_ATTR_ID = createParameter("p_attr_id", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>kloopzcm.md_delete_relation_attribute.p_delete_all</code>.
     */
    public static final Parameter<Boolean> P_DELETE_ALL = createParameter("p_delete_all", org.jooq.impl.SQLDataType.BOOLEAN, false, false);

    /**
     * Create a new routine call instance
     */
    public MdDeleteRelationAttribute() {
        super("md_delete_relation_attribute", Kloopzcm.KLOOPZCM);

        addInParameter(P_ATTR_ID);
        addInParameter(P_DELETE_ALL);
    }

    /**
     * Set the <code>p_attr_id</code> parameter IN value to the routine
     */
    public void setPAttrId(Integer value) {
        setValue(P_ATTR_ID, value);
    }

    /**
     * Set the <code>p_delete_all</code> parameter IN value to the routine
     */
    public void setPDeleteAll(Boolean value) {
        setValue(P_DELETE_ALL, value);
    }
}
