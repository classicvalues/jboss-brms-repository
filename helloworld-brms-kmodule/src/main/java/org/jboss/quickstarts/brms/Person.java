package org.jboss.quickstarts.brms;

/**
 * This class was automatically generated by the data modeler tool.
 */
public class Person  implements java.io.Serializable {

static final long serialVersionUID = 1L;
    
    @org.kie.api.definition.type.Position(value = 1)
    private java.util.Date birthDate;
    
    @org.kie.api.definition.type.Position(value = 0)
    private java.lang.String name;

    public Person() {
    }

    public Person(java.lang.String name, java.util.Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }


    
    public java.util.Date getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(  java.util.Date birthDate ) {
        this.birthDate = birthDate;
    }
    
    public java.lang.String getName() {
        return this.name;
    }

    public void setName(  java.lang.String name ) {
        this.name = name;
    }
}