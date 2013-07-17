package org.openehr.am;

import javax.xml.bind.annotation.XmlTransient;

/**
 * Base class for all AM package classes
 *
 * @author Saxo
 */
@XmlTransient
public abstract class AmObject {
    public static final String AM_VERSION = "1.0.2";
}