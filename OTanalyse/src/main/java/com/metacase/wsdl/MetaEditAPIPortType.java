/**
 * MetaEditAPIPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.metacase.wsdl;

public interface MetaEditAPIPortType extends java.rmi.Remote {

    /**
     * Returns a set of all instances of this Graph type in currently
     * open projects.
     */
    public com.metacase.type.MEOop[] allGoodInstances(com.metacase.type.METype receiver) throws java.rmi.RemoteException;

    /**
     * Returns a set of all instances of this Graph type or its subtypes
     * in currently open projects.
     */
    public com.metacase.type.MEOop[] allSimilarInstances(com.metacase.type.METype receiver) throws java.rmi.RemoteException;

    /**
     * Looks at subtypes of the METype receiver argument, and returns
     * the METype of the first subtype whose name matches the wildcard string
     * in the second argument. If none are found, returns the same METype
     * as the receiver argument.
     */
    public com.metacase.type.METype subTypeNamed(com.metacase.type.METype receiver, java.lang.String subTypeNamed) throws java.rmi.RemoteException;

    /**
     * Returns the set of NonProperties from this Graph whose id property
     * value matches the specified string, which can contain ? and * as wildcards.
     * Case insensitive.
     */
    public com.metacase.type.MEOop[] findString(com.metacase.type.MEOop receiver, java.lang.String findString) throws java.rmi.RemoteException;

    /**
     * Returns a sorted collection of all loaded matching instances
     * of matching types. Types may be the METype receiver argument or its
     * subtypes. Matching is case insensitive with wildcards. Note that only
     * graph instances in open projects are guaranteed to be loaded.
     */
    public com.metacase.type.MEOop[] instancesNamed(com.metacase.type.METype receiver, java.lang.String instancesNamed, java.lang.String ofSubTypesNamed) throws java.rmi.RemoteException;

    /**
     * Returns the user-visible string name of the receiver argument,
     * an METype.
     */
    public java.lang.String typeName(com.metacase.type.METype receiver) throws java.rmi.RemoteException;

    /**
     * Returns an METype, the type of the receiver argument. The receiver
     * argument must be the MEOop of a GOPPRR instance.
     */
    public com.metacase.type.METype type(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException;

    /**
     * Returns the string typeName of the type of the receiver argument,
     * an MEOop representing a GOPPRR instance.
     */
    public java.lang.String typeTypeName(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException;

    /**
     * Returns the simple string representation of the receiver argument,
     * an MEOop representing any conceptual or representational element.
     */
    public java.lang.String userPrintString(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException;

    /**
     * Returns an MEAny representing the nth property value of the
     * receiver argument, a NonProperty MEOop. The second argument must be
     * an integer, starting with 1 for the first property.
     */
    public com.metacase.type.MEAny valueAt(com.metacase.type.MEOop receiver, int valueAt) throws java.rmi.RemoteException;

    /**
     * Sets the value of the the nth property value of the receiver
     * argument, a NonProperty MEOop. The second argument must be an integer,
     * starting with 1 for the first property. The third argument is an MEAny
     * containing the value for the property. Returns an MEAny containing
     * the MEOop of the property that was changed, or an MEAny containing
     * an MENull if unsuccessful (e.g. if the value is not of the right type
     * or fails the property type's regular expression rule).
     */
    public com.metacase.type.MEAny setValueAt(com.metacase.type.MEOop receiver, int valueAt, com.metacase.type.MEAny put) throws java.rmi.RemoteException;

    /**
     * Returns an MEAnyArray of the values of the properties of the
     * receiver argument, a NonProperty MEOop.
     */
    public com.metacase.type.MEAny[] allPropertiesValues(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException;

    /**
     * Returns an MEOopArray of the properties of the receiver argument,
     * a NonProperty MEOop. (Note this returns the actual properties, not
     * their values: if you want the values, use allPropertiesValues.) This
     * can be useful when working with property sharing; note though that
     * instProps requires an MEAnyArray, so each MEOop returned here would
     * have to be wrapped in an MEAny. The method allPropertiesWrapped returns
     * such an MEAnyArray.
     */
    public com.metacase.type.MEOop[] allProperties(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException;

    /**
     * Returns an MEAnyArray of the properties of the receiver argument,
     * a NonProperty MEOop. (Note this returns the actual properties, not
     * their values.) This is useful for setting up property sharing, since
     * instProps requires an MEAnyArray of properties. To get just the properties
     * as an MEOopArray, use allProperties. To get just their values, use
     * allPropertiesValues.
     */
    public com.metacase.type.MEAny[] allPropertiesWrapped(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException;

    /**
     * Creates or sets the properties of an instance of the METype
     * argument, returning an MEAny with the MEOop of the instance, or MENull
     * for an error. The first argument is the METype; propColl is an array
     * of MEAnys, either MEOops of existing property instances or MENull
     * to create a new property of the default type; valueColl is an array
     * of MEAnys, the values of the properties; np is an MEAny, either the
     * MEOop of an existing NonProperty of this type, or MENull to create
     * a new one; inArea is an MEAny, either an integer corresponding to
     * the project's area number, or MENull for the default (the same project
     * as np if it exists already, else the current default project).
     */
    public com.metacase.type.MEAny instProps(com.metacase.type.METype receiver, com.metacase.type.MEAny[] propColl, com.metacase.type.MEAny[] valueColl, com.metacase.type.MEAny np, com.metacase.type.MEAny inArea) throws java.rmi.RemoteException;

    /**
     * As instProps, but locks the properties, np and other internal
     * objects if necessary.
     */
    public com.metacase.type.MEAny instPropsLocking(com.metacase.type.METype receiver, com.metacase.type.MEAny[] propCollLocking, com.metacase.type.MEAny[] valueColl, com.metacase.type.MEAny np, com.metacase.type.MEAny inArea) throws java.rmi.RemoteException;

    /**
     * Create and return the MEOop of a new instance of the receiver
     * argument, a NonProperty type METype. The result is created in the
     * current default project. Properties are created with their default
     * values, and the result is not checked against the metamodel rules.
     */
    public com.metacase.type.MEOop unsafeNew(com.metacase.type.METype receiver) throws java.rmi.RemoteException;

    /**
     * Opens the Create Graph dialog, with the Graph type in the first
     * argument as the initial selection (or none, if this is the Graph metatype).
     * Creates the graph and returns an MEAny containing the new graph's
     * MEOop, or MENull if creation was cancelled or unsuccessful. As the
     * graph is new, it will have at most one representation, which can be
     * found from its repSet.
     */
    public com.metacase.type.MEAny createGraphDialog(com.metacase.type.METype receiver) throws java.rmi.RemoteException;

    /**
     * Opens a property dialog to create a new instance of the first
     * argument, an METype. The project to store the new instance in is specified
     * by the second argument, an integer. Valid numbers are 3 and above,
     * and an existing instance's project/area number can be found from the
     * areaID of its MEOop. Returns an MEAny, containing the MEOop of the
     * new instance or an MENull if unsuccessful.
     */
    public com.metacase.type.MEAny createFromPropertyDialogInArea(com.metacase.type.METype receiver, int createFromPropertyDialogInArea) throws java.rmi.RemoteException;

    /**
     * Opens a property dialog for the receiver argument, an MEOop
     * of a NonProperty instance. Returns true if the edit is successful
     * or false if the user cancels.
     */
    public boolean propertyDialog(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException;

    /**
     * Returns a string with the local names of the properties of
     * the receiver METype argument, one per line.
     */
    public java.lang.String allLocalNamesString(com.metacase.type.METype receiver) throws java.rmi.RemoteException;

    /**
     * For the receiver argument, an MEOop representing a NonProperty,
     * return an MEAny representing the first property whose local name matches
     * the second argument, a string. The MEAny will hold the MEOop of the
     * property if successful, or an MENull if the string is not a local
     * name in this type.
     */
    public com.metacase.type.MEAny propertyForLocalName(com.metacase.type.MEOop receiver, java.lang.String propertyForLocalName) throws java.rmi.RemoteException;

    /**
     * For the receiver argument, an MEOop representing a NonProperty,
     * return an MEAny representing the value of the first property whose
     * local name matches the second argument, a string. The MEAny will hold
     * the value of the property if successful, or an MENull if the string
     * is not a local name in this type.
     */
    public com.metacase.type.MEAny valueForLocalName(com.metacase.type.MEOop receiver, java.lang.String valueForLocalName) throws java.rmi.RemoteException;

    /**
     * Returns the set of all Objects in this Graph
     */
    public com.metacase.type.MEOop[] objectSet(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException;

    /**
     * Returns the set of all ports from all bindings in this graph.
     * The first argument is the MEOop of the graph. Note that each port
     * may be either a static port (of metatype Port) or a dynamic port (of
     * metatype Object).
     */
    public com.metacase.type.MEOop[] portSet(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException;

    /**
     * Returns the set of all Relationships in this Graph.
     */
    public com.metacase.type.MEOop[] relationshipSet(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException;

    /**
     * Returns the set of all Roles in this Graph.
     */
    public com.metacase.type.MEOop[] roleSet(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException;

    /**
     * Returns the set of all Binding MEOops in this Graph MEOop
     */
    public com.metacase.type.MEOop[] bindingSet(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException;

    /**
     * Return the contents of this graph that match the supplied type
     * (or also its subtypes, if allowSubTypes is true). The first argument
     * is an MEOop representing the graph. The second argument is the METype
     * of the desired type. The third argument is the boolean stating whether
     * to include instances of subtypes. The result is an MEOopArray of the
     * instances directly in this graph matching the type.
     */
    public com.metacase.type.MEOop[] contentsMatchingType(com.metacase.type.MEOop receiver, com.metacase.type.METype contentsMatchingType, boolean allowSubTypes) throws java.rmi.RemoteException;

    /**
     * Returns the set of Graphs that are explosions of objects in
     * the receiver argument, a Graph MEOop.
     */
    public com.metacase.type.MEOop[] explodeGraphs(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException;

    /**
     * Returns the set of Graphs that are decompositions of objects
     * in the receiver argument, a Graph MEOop.
     */
    public com.metacase.type.MEOop[] decompGraphs(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException;

    /**
     * Returns the set of Graphs that are subgraphs (i.e. either explosions
     * or decompositions) of the receiver argument, a Graph MEOop.
     */
    public com.metacase.type.MEOop[] subgraphs(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException;

    /**
     * In the receiver argument, a Graph MEOop, add a new explosion
     * to the second argument, a Graph MEOop, for the final argument, an
     * Object MEOop.
     */
    public com.metacase.type.MEOop addExplode(com.metacase.type.MEOop receiver, com.metacase.type.MEOop addExplode, com.metacase.type.MEOop _for) throws java.rmi.RemoteException;

    /**
     * For this Graph and this NonProperty, returns the set of explosion
     * subgraphs
     */
    public com.metacase.type.MEOop[] getExplodeGraphsForNP(com.metacase.type.MEOop receiver, com.metacase.type.MEOop getExplodeGraphsForNP) throws java.rmi.RemoteException;

    /**
     * Removes the explosion link from the receiver argument, a Graph
     * MEOop. The second argument is the target Graph MEOop of the explosion
     * to remove. The third argument is the source Object, Role or Relationship
     * MEOop of the explosion to remove. The result is the receiver Graph
     * MEOop.
     */
    public com.metacase.type.MEOop removeExplode(com.metacase.type.MEOop receiver, com.metacase.type.MEOop removeExplode, com.metacase.type.MEOop _for) throws java.rmi.RemoteException;

    /**
     * Get the decomposition of the receiver argument, an Object MEOop.
     * Returns an MEAny containing either a Graph MEOop or MENull.
     */
    public com.metacase.type.MEAny decompGraph(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException;

    /**
     * Set the decomposition of the receiver argument, an Object MEOop,
     * to be the decompGraph argument, an MEAny containing either a Graph
     * MEOop or MENull. Returns an MEAny containing either the receiver for
     * success or MENull for failure.
     */
    public com.metacase.type.MEAny setDecompGraph(com.metacase.type.MEOop receiver, com.metacase.type.MEAny decompGraph) throws java.rmi.RemoteException;

    /**
     * For this receiver Graph and this Object, returns the set of
     * Objects directly connected to it. The third argument restricts the
     * type of the connected Objects: use NonProperty for no restriction.
     */
    public com.metacase.type.MEOop[] objsForObj(com.metacase.type.MEOop receiver, com.metacase.type.MEOop objsForObj, com.metacase.type.METype ofClass) throws java.rmi.RemoteException;

    /**
     * For this receiver Graph and this port, returns the set of Objects
     * directly connected to it. Note that the port in the second argument
     * may be a static port (of metatype Port) or a dynamic port (of metatype
     * Object). The third argument restricts the type of the connected objects:
     * use NonProperty for no restriction.
     */
    public com.metacase.type.MEOop[] objsForPort(com.metacase.type.MEOop receiver, com.metacase.type.MEOop objsForPort, com.metacase.type.METype ofClass) throws java.rmi.RemoteException;

    /**
     * For this receiver Graph and this Relationship, returns the
     * set of Objects directly connected to it. The third argument restricts
     * the type of the connected Objects: use NonProperty for no restriction.
     */
    public com.metacase.type.MEOop[] objsForRel(com.metacase.type.MEOop receiver, com.metacase.type.MEOop objsForRel, com.metacase.type.METype ofClass) throws java.rmi.RemoteException;

    /**
     * For this receiver Graph and this Role, returns the set of Objects
     * directly connected to it. The third argument restricts the type of
     * the connected Objects: use NonProperty for no restriction.
     */
    public com.metacase.type.MEOop[] objsForRole(com.metacase.type.MEOop receiver, com.metacase.type.MEOop objsForRole, com.metacase.type.METype ofClass) throws java.rmi.RemoteException;

    /**
     * For this receiver Graph and this Object, returns the set of
     * ports directly connected to it. Note that each port may be either
     * a static port (of metatype Port) or a dynamic port (of metatype Object).
     * The third argument restricts the type of the connected ports: use
     * NonProperty for no restriction.
     */
    public com.metacase.type.MEOop[] portsForObj(com.metacase.type.MEOop receiver, com.metacase.type.MEOop portsForObj, com.metacase.type.METype ofClass) throws java.rmi.RemoteException;

    /**
     * For this receiver Graph and this port, returns the set of ports
     * directly connected to it. Note that each port in the result and second
     * argument may be a static port (of metatype Port) or a dynamic port
     * (of metatype Object). The third argument restricts the type of the
     * connected ports: use NonProperty for no restriction.
     */
    public com.metacase.type.MEOop[] portsForPort(com.metacase.type.MEOop receiver, com.metacase.type.MEOop portsForPort, com.metacase.type.METype ofClass) throws java.rmi.RemoteException;

    /**
     * For this receiver Graph and this Relationship, returns the
     * set of ports directly connected to it. Note that each port may be
     * either a static port (of metatype Port) or a dynamic port (of metatype
     * Object). The third argument restricts the type of the connected ports:
     * use NonProperty for no restriction.
     */
    public com.metacase.type.MEOop[] portsForRel(com.metacase.type.MEOop receiver, com.metacase.type.MEOop portsForRel, com.metacase.type.METype ofClass) throws java.rmi.RemoteException;

    /**
     * For this receiver Graph and this Role, returns the set of ports
     * directly connected to it (either empty or a single port). Note that
     * the port may be either a static port (of metatype Port) or a dynamic
     * port (of metatype Object). The third argument restricts the type of
     * the connected ports: use NonProperty for no restriction.
     */
    public com.metacase.type.MEOop[] portsForRole(com.metacase.type.MEOop receiver, com.metacase.type.MEOop portsForRole, com.metacase.type.METype ofClass) throws java.rmi.RemoteException;

    /**
     * For this receiver Graph and this Object, returns the set of
     * Relationships directly connected to it. The third argument restricts
     * the type of the connected Relationships: use NonProperty for no restriction.
     */
    public com.metacase.type.MEOop[] relsForObj(com.metacase.type.MEOop receiver, com.metacase.type.MEOop relsForObj, com.metacase.type.METype ofClass) throws java.rmi.RemoteException;

    /**
     * For this receiver Graph and this port, returns the set of Relationships
     * directly connected to it. Note that the port in the second argument
     * may be a static port (of metatype Port) or a dynamic port (of metatype
     * Object). The third argument restricts the type of the connected relationships:
     * use NonProperty for no restriction.
     */
    public com.metacase.type.MEOop[] relsForPort(com.metacase.type.MEOop receiver, com.metacase.type.MEOop relsForPort, com.metacase.type.METype ofClass) throws java.rmi.RemoteException;

    /**
     * For this receiver Graph and this Relationship, returns the
     * set of Relationships connected to objects in this Relationship. The
     * third argument restricts the type of the connected Relationships:
     * use NonProperty for no restriction.
     */
    public com.metacase.type.MEOop[] relsForRel(com.metacase.type.MEOop receiver, com.metacase.type.MEOop relsForRel, com.metacase.type.METype ofClass) throws java.rmi.RemoteException;

    /**
     * For this receiver Graph and this Role, returns the set of Relationships
     * directly connected to it. The third argument restricts the type of
     * the connected Relationships: use NonProperty for no restriction.
     */
    public com.metacase.type.MEOop[] relsForRole(com.metacase.type.MEOop receiver, com.metacase.type.MEOop relsForRole, com.metacase.type.METype ofClass) throws java.rmi.RemoteException;

    /**
     * For this receiver Graph and this Object, returns the set of
     * Roles directly connected to it. The third argument restricts the type
     * of the connected Roles: use NonProperty for no restriction.
     */
    public com.metacase.type.MEOop[] rolesForObj(com.metacase.type.MEOop receiver, com.metacase.type.MEOop rolesForObj, com.metacase.type.METype ofClass) throws java.rmi.RemoteException;

    /**
     * For this receiver Graph and this port, returns the set of Roles
     * directly connected to it. Note that the port in second argument may
     * be a static port (of metatype Port) or a dynamic port (of metatype
     * Object). The third argument restricts the type of the connected ports:
     * use NonProperty for no restriction.
     */
    public com.metacase.type.MEOop[] rolesForPort(com.metacase.type.MEOop receiver, com.metacase.type.MEOop rolesForPort, com.metacase.type.METype ofClass) throws java.rmi.RemoteException;

    /**
     * For this receiver Graph and this Relationship, returns the
     * set of Roles directly connected to it. The third argument restricts
     * the type of the connected Roles: use NonProperty for no restriction.
     */
    public com.metacase.type.MEOop[] rolesForRel(com.metacase.type.MEOop receiver, com.metacase.type.MEOop rolesForRel, com.metacase.type.METype ofClass) throws java.rmi.RemoteException;

    /**
     * For this receiver Graph and this Role, returns the set of Roles
     * that belong to the same binding as this Role. The third argument restricts
     * the type of the connected Roles: use NonProperty for no restriction.
     */
    public com.metacase.type.MEOop[] rolesForRole(com.metacase.type.MEOop receiver, com.metacase.type.MEOop rolesForRole, com.metacase.type.METype ofClass) throws java.rmi.RemoteException;

    /**
     * For the receiver argument, a Graph MEOop, run the generator
     * named in the second argument, a string. Returns a boolean indicating
     * whether the generation proceeded without fatal errors.
     */
    public boolean forGraphRun(com.metacase.type.MEOop receiver, java.lang.String forGraphRun) throws java.rmi.RemoteException;

    /**
     * For the receiver argument, a Graph MEOop, run the generator
     * named in the second argument, a string. If the third argument, a string,
     * is non-empty, first run the generator named there. Returns the contents
     * of the default screen output stream produced by the generator(s).
     */
    public java.lang.String textForGraphRun(com.metacase.type.MEOop receiver, java.lang.String textForGraphRun, java.lang.String preRun) throws java.rmi.RemoteException;

    /**
     * The first argument is an MENull. Runs the generator named in
     * the second argument, textForRun, a string. The third argument, stack,
     * is the MERL element stack, an MEAnyArray generally containing an MEOop
     * for the graph, and possibly with subsequent stack elements for an
     * object, subgraph, property or string element. The fourth argument,
     * arguments, is an MEAnyArray for the arguments supplied to the generator,
     * generally empty or containing String MEAnys; any MEOop MEAnys will
     * be converted to a string representation before being used as an argument.
     * If the fifth argument, preRun, a string, is non-empty, first run the
     * generator named there. Returns the contents of the default screen
     * output stream produced by the generator(s).
     */
    public java.lang.String textForRun(com.metacase.type.MENull receiver, java.lang.String textForRun, com.metacase.type.MEAny[] stack, com.metacase.type.MEAny[] arguments, java.lang.String preRun) throws java.rmi.RemoteException;

    /**
     * Returns the names of the generators defined in the receiver
     * argument, a Graph METype, one per line.
     */
    public java.lang.String generatorNames(com.metacase.type.METype receiver) throws java.rmi.RemoteException;

    /**
     * Opens the receiver argument in a graph representation. Will
     * prompt with a list dialog in MetaEdit+ if there is more than one possibility.
     */
    public com.metacase.type.MENull open(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException;

    /**
     * Opens the specified graph and highlights the specified NonProperty.
     * The receiver argument is the MEOop of the graph, the second is the
     * MEOop of the NonProperty. This will never prompt.
     */
    public com.metacase.type.MENull animate(com.metacase.type.MEOop receiver, com.metacase.type.MEOop animate) throws java.rmi.RemoteException;

    /**
     * Opens the specified diagram and highlights the specified ObjectReprs.
     * The receiver argument is the MEOop of the diagram, the second is the
     * MEOopArray of the ObjectReprs. This will never prompt.
     */
    public com.metacase.type.MENull animateAll(com.metacase.type.MEOop receiver, com.metacase.type.MEOop[] animateAll) throws java.rmi.RemoteException;

    /**
     * Turns off all highlighting in any editor open on the diagram.
     * Does not open the diagram.
     */
    public com.metacase.type.MENull animateNone(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException;

    /**
     * Refreshes the display of the receiver argument, which is an
     * MEOop of any conceptual or representational instance.
     */
    public com.metacase.type.MENull refresh(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException;

    /**
     * Returns a Boolean indicating whether there are any changes
     * to persistent data that are not yet committed to the repository.
     */
    public boolean isDirty(com.metacase.type.MENull receiver) throws java.rmi.RemoteException;

    /**
     * Returns a Boolean indicating whether MetaEdit+ is logged out
     * of the repository. Initially true, false once logged in (from early
     * during the login process).
     */
    public boolean isLogout(com.metacase.type.MENull receiver) throws java.rmi.RemoteException;

    /**
     * Returns the MEOops of objects currently in the copy buffer.
     * Bindings in the copy buffer are ignored. This is a useful way of allowing
     * users to select an object in MetaEdit+, and have your application
     * know which object was selected: rather than just selecting the object,
     * they can select and copy it.
     */
    public com.metacase.type.MEOop[] copiedObjects(com.metacase.type.MENull receiver) throws java.rmi.RemoteException;

    /**
     * Returns an MEAny array containing information about a binding
     * creation that was started before the timeout, or an empty MEAny array
     * if it times out. The 3-element array is: the graph representation
     * (MEAny of MEOop), relationship type (MEAny of METype), and first object
     * representation (MEAny of MEOop).
     */
    public com.metacase.type.MEAny[] waitForBindingCreation(com.metacase.type.MENull receiver, int waitForBindingCreation) throws java.rmi.RemoteException;

    /**
     * Returns an MEAny array: empty if it times out, containing the
     * diagram and two MENulls if binding creation was cancelled (either
     * during the duration of this call or before it, i.e. the diagram does
     * not currently have an open editor in binding creation mode), or containing
     * the diagram, new bindingRepr and binding
     */
    public com.metacase.type.MEAny[] waitForBindingFinalization(com.metacase.type.MENull receiver, int waitForBindingFinalization, com.metacase.type.MEOop in) throws java.rmi.RemoteException;

    /**
     * Return the MEOops of all representation graphs that are currently
     * open in editors, uppermost first.
     */
    public com.metacase.type.MEOop[] openedGraphReprs(com.metacase.type.MENull receiver) throws java.rmi.RemoteException;

    /**
     * Start an Undo Memento to contain the following API operations,
     * up to the next stopMemento command. The first argument is an MENull.
     * The second argument is the label for the Undo Memento, a short string
     * describing what the commands do. The return value is a boolean showing
     * whether the operation was successful.
     */
    public boolean startMemento(com.metacase.type.MENull receiver, java.lang.String startMemento) throws java.rmi.RemoteException;

    /**
     * Stop the current Undo Memento, collecting all the commands
     * since the preceding startMemento into an undoable operation. The first
     * argument is an MENull. The second argument is the label for the Undo
     * Memento, which must match the label given in the preceding startMemento,
     * which must still be the current memento. The return value is a boolean
     * showing whether the operation was successful.
     */
    public boolean stopMemento(com.metacase.type.MENull receiver, java.lang.String stopMemento) throws java.rmi.RemoteException;

    /**
     * Lock the objects supplied as MEOops in the second argument,
     * for the current user for the duration of the current transaction.
     * Returns an empty string on success, or a string listing the objects
     * that could not be locked on failure. Only necessary in the multi-user
     * version.
     */
    public java.lang.String lockAll(com.metacase.type.MENull receiver, com.metacase.type.MEOop[] lockAll) throws java.rmi.RemoteException;

    /**
     * Delete the receiver argument, a Graph MEOop, and all its representations.
     * Note this also deletes subgraph links to this graph from other graphs
     * in open projects. It does not delete subgraphs of this graph.
     */
    public com.metacase.type.MENull delete(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException;

    /**
     * Adds the receiver argument, an Object MEOop, to the second
     * argument, a Graph MEOop. No type checking is performed.
     */
    public com.metacase.type.MENull addToGraph(com.metacase.type.MEOop receiver, com.metacase.type.MEOop addToGraph) throws java.rmi.RemoteException;

    /**
     * Creates a new binding into the receiver argument, a Graph MEOop.
     * The second argument is the METype of the relationship to create. The
     * third argument is an METypeArray of the types of Roles to create.
     * The final argument is an MEOopArray of the existing Objects that this
     * binding connects, in the same order as the third argument. The return
     * value is the newly created binding MEOop.
     */
    public com.metacase.type.MEOop createBinding(com.metacase.type.MEOop receiver, com.metacase.type.METype relType, com.metacase.type.METype[] roleTypes, com.metacase.type.MEOop[] objects) throws java.rmi.RemoteException;

    /**
     * Creates a new binding with ports into the receiver argument,
     * a Graph MEOop. The second argument is the METype of the relationship
     * to create. The third, fourth and fifth arguments are parallel collections
     * of the same size, whose Nth member refers to the Nth role, port and
     * object. The third argument is an METypeArray of the types of Roles
     * to create. The fourth argument is an MEAnyArray of the existing instance
     * ports (static or dynamic) through which this binding's roles will
     * connect to their object - each element is an MEAny of an MEOop for
     * a port, or an MEAny of an MENull for no port. The final argument is
     * an MEOopArray (NB not an MEAnyArray) of the existing Objects that
     * this binding will connect. The return value is the newly created binding
     * MEOop.
     */
    public com.metacase.type.MEOop createBindingWithPorts(com.metacase.type.MEOop receiver, com.metacase.type.METype relType, com.metacase.type.METype[] roleTypes, com.metacase.type.MEAny[] ports, com.metacase.type.MEOop[] objects) throws java.rmi.RemoteException;

    /**
     * In the receiver argument, a Graph MEOop, remove the second
     * argument, a Binding MEOop, and any explosions of its relationship
     * or roles, and return true. If the binding still has Diagram representations,
     * leave the graph as it is and return false. (To delete the Diagram
     * representations of a Binding, iterate over the Binding's repSet(),
     * sending remove() to each.)
     */
    public boolean removeBinding(com.metacase.type.MEOop receiver, com.metacase.type.MEOop removeBinding) throws java.rmi.RemoteException;

    /**
     * Returns the relationship MEOop of this binding MEOop
     */
    public com.metacase.type.MEOop relationship(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException;

    /**
     * Returns an MEOopArray of the roles in this binding MEOop in
     * order
     */
    public com.metacase.type.MEOop[] roles(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException;

    /**
     * Returns an MEAnyArray of the ports for each role in this binding
     * MEOop in order. Each element is an MEAny of an MEOop for a port, or
     * an MEAny of an MENull if that role does not connect via a port.
     */
    public com.metacase.type.MEAny[] portSlots(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException;

    /**
     * Returns an MEOopArray of the objects in this binding MEOop
     * in order
     */
    public com.metacase.type.MEOop[] objects(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException;

    /**
     * Returns an MEAnyArray containing the integer ids of the connections
     * in the receiver argument, a binding MEOop. This is intended primarily
     * for use with the Diagram binding representation method, connectionReprIds.
     */
    public com.metacase.type.MEAny[] connectionIds(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException;

    /**
     * Returns an MEOopArray containing the set of diagram representations
     * of the receiver argument, a Graph MEOop.
     */
    public com.metacase.type.MEOop[] diagrams(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException;

    /**
     * Returns an MEOopArray containing the set of matrix representations
     * of the receiver argument, a Graph MEOop.
     */
    public com.metacase.type.MEOop[] matrices(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException;

    /**
     * Returns an MEOopArray containing the set of table representations
     * of the receiver argument, a Graph MEOop.
     */
    public com.metacase.type.MEOop[] tables(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException;

    /**
     * Creates a new diagram representation for the receiver argument,
     * a Graph MEOop, and returns the MEOop for the new representation.
     */
    public com.metacase.type.MEOop newDiagram(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException;

    /**
     * Creates a new matrix representation for the receiver argument,
     * a Graph MEOop, and returns the MEOop for the new representation.
     */
    public com.metacase.type.MEOop newMatrix(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException;

    /**
     * Creates a new table representation for the receiver argument,
     * a Graph MEOop, and returns the MEOop for the new representation.
     */
    public com.metacase.type.MEOop newTable(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException;

    /**
     * Returns the NonProperty MEOop represented by the receiver argument,
     * an MEOop of a representation element.
     */
    public com.metacase.type.MEOop inst(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException;

    /**
     * Returns an MEOopArray containing all representation elements
     * of the receiver argument, a NonProperty MEOop.
     */
    public com.metacase.type.MEOop[] repSet(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException;

    /**
     * Returns the representation graph to which this representation
     * element belongs. The receiver argument must be an MEOop of a representation
     * element.
     */
    public com.metacase.type.MEOop reprGraph(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException;

    /**
     * Removes the receiver argument, any representation MEOop. Returns
     * the NonProperty MEOop the receiver used to represent.
     */
    public com.metacase.type.MEOop remove(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException;

    /**
     * Returns the timestamp of the receiver argument, a representation
     * graph MEOop.
     */
    public java.util.Calendar timeStamp(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException;

    /**
     * Sets the timestamp of the receiver argument, a representation
     * graph MEOop.
     */
    public com.metacase.type.MENull setTimeStamp(com.metacase.type.MEOop receiver, java.util.Calendar timeStamp) throws java.rmi.RemoteException;

    /**
     * Returns an MEOopArray of the object representations in the
     * receiver argument, a diagram MEOop. The result is in Z-order, backmost
     * first.
     */
    public com.metacase.type.MEOop[] objectReprs(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException;

    /**
     * Returns an MEOopArray of the binding representations in the
     * receiver argument, a diagram MEOop. The result is in Z-order, backmost
     * first.
     */
    public com.metacase.type.MEOop[] bindingReprs(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException;

    /**
     * Returns an MEAny containing a point specifying the size of
     * the grid in the receiver argument, a diagram MEOop.
     */
    public com.metacase.type.MEAny grid(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException;

    /**
     * Sets the size of the grid in the receiver argument, a diagram
     * MEOop. The value is an MEAny containing a point specifying the size
     * of the grid.
     */
    public com.metacase.type.MENull setGrid(com.metacase.type.MEOop receiver, com.metacase.type.MEAny grid) throws java.rmi.RemoteException;

    /**
     * Returns a Boolean indicating whether the grid is displayed
     * in the receiver argument, a diagram MEOop.
     */
    public boolean displayGrid(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException;

    /**
     * Sets a Boolean indicating whether the grid is displayed in
     * the receiver argument, a diagram MEOop.
     */
    public com.metacase.type.MENull setDisplayGrid(com.metacase.type.MEOop receiver, boolean displayGrid) throws java.rmi.RemoteException;

    /**
     * Returns a Boolean indicating whether Snap to Grid is on in
     * the receiver argument, a diagram MEOop.
     */
    public boolean useGrid(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException;

    /**
     * Sets a Boolean indicating whether Snap to Grid is on in the
     * receiver argument, a diagram MEOop.
     */
    public com.metacase.type.MENull setUseGrid(com.metacase.type.MEOop receiver, boolean useGrid) throws java.rmi.RemoteException;

    /**
     * Returns the position of the receiver, an MEOop for an object
     * or binding representation in a diagram argument. The result returned
     * is an MEAny containing a point, where 1 represents 1 pixel at 100%
     * zoom.
     */
    public com.metacase.type.MEAny place(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException;

    /**
     * Sets the position of the receiver argument, an MEOop for an
     * object or binding representation in a diagram. The value is an MEAny
     * containing a point, where 1 represents 1 pixel at 100% zoom.
     */
    public com.metacase.type.MENull setPlace(com.metacase.type.MEOop receiver, com.metacase.type.MEAny place) throws java.rmi.RemoteException;

    /**
     * Returns the scale of the receiver argument, an MEOop for an
     * object or binding representation in a diagram. The result returned
     * is an MEAny containing a point, where 1 represents 100%.
     */
    public com.metacase.type.MEAny scale(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException;

    /**
     * Sets the scale of the receiver argument, an MEOop for an object
     * or binding representation in a diagram. The value is an MEAny containing
     * a point, where 1 represents 100%.
     */
    public com.metacase.type.MENull setScale(com.metacase.type.MEOop receiver, com.metacase.type.MEAny scale) throws java.rmi.RemoteException;

    /**
     * Returns a Boolean indicating whether the receiver argument,
     * a diagram binding representation MEOop, is straight.
     */
    public boolean isStraight(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException;

    /**
     * Sets a Boolean indicating whether the receiver argument, a
     * diagram binding representation MEOop, is straight.
     */
    public com.metacase.type.MENull setIsStraight(com.metacase.type.MEOop receiver, boolean isStraight) throws java.rmi.RemoteException;

    /**
     * Straightens the receiver argument, a diagram binding representation
     * MEOop. The receiver must be a binary binding. All breakpoints and
     * target point offsets are removed from all connection representations,
     * and the relationship position is set to the midpoint of the role lines.
     */
    public com.metacase.type.MENull straighten(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException;

    /**
     * Creates a new diagram representation with automatic layout
     * for the graph denoted by the first MEOop argument. The auto-layout
     * algorithm assumes a directed acyclic graph (DAG) as its input and
     * therefore the user must provide the API call with rules according
     * to which the DAG is built. Therefore, the following argument, relationship,
     * defines the relationship type which instances appear as edges in the
     * DAG. The two following arguments, parentRole and childRole, define
     * the directivity according to which the DAG is build. The fifth argument,
     * direction, provides the information how the layout is distributed
     * and can have either 'vertical' or 'horizontal' as values. The final
     * argument, manhattan, toggles the usage of orthogonal or diagonal lines
     * between DAG nodes.
     */
    public com.metacase.type.MENull layout(com.metacase.type.MEOop receiver, com.metacase.type.METype layoutRelationship, com.metacase.type.METype fromRole, com.metacase.type.METype toRole, java.lang.String direction, boolean manhattan) throws java.rmi.RemoteException;

    /**
     * Adds a new object representation to the receiver argument,
     * a diagram MEOop. The second argument is the MEOop of the object to
     * represent. The third argument is a 1-based integer before which to
     * insert the new binding representation in the Z-ordered collection
     * of binding representations: 1 is the backmost element. The fourth
     * argument is an MEAny containing the point position of the new object
     * representation. The return value is the MEOop of the new object representation.
     */
    public com.metacase.type.MEOop addNewObjectRepFor(com.metacase.type.MEOop receiver, com.metacase.type.MEOop addNewObjectRepFor, int beforeIndex, com.metacase.type.MEAny place) throws java.rmi.RemoteException;

    /**
     * Adds a new binding representation to the receiver argument,
     * a diagram MEOop. The second argument is the MEOop of the binding to
     * represent. The third argument is a 1-based integer before which to
     * insert the new binding representation in the Z-ordered collection
     * of binding representations: 1 is the backmost element. The fourth
     * argument is an MEAny containg the point position of the relationship
     * representation. The return value is the MEOop of the new binding representation.
     */
    public com.metacase.type.MEOop addNewBindingRepFor(com.metacase.type.MEOop receiver, com.metacase.type.MEOop addNewBindingRepFor, int beforeIndex, com.metacase.type.MEAny place) throws java.rmi.RemoteException;

    /**
     * Returns an MEAnyArray containing the integer ids of the connections
     * represented in the receiver argument, a diagram binding representation
     * MEOop.
     */
    public com.metacase.type.MEAny[] connectionReprIds(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException;

    /**
     * Returns the breakpoints of a connection representation in the
     * receiver argument, a diagram binding representation MEOop. The second
     * argument is the integer id of the connection within this binding.
     */
    public com.metacase.type.MEAny[] breakpoints(com.metacase.type.MEOop receiver, int breakpointsWithId) throws java.rmi.RemoteException;

    /**
     * Sets the breakpoints of a role representation in the receiver
     * argument, a diagram binding representation MEOop. The second argument
     * is an MEAnyArray containing the coordinates of the breakpoints. The
     * third argument is the integer id of the connection within this binding.
     * This operation also flags the binding repr non-straight, which is
     * needed after setting the breakpoints in order to ensure proper behaviour.
     */
    public com.metacase.type.MENull setBreakpoints(com.metacase.type.MEOop receiver, com.metacase.type.MEAny[] setBreakpoints, int id) throws java.rmi.RemoteException;

    /**
     * Adds a new breakpoint to a role representation in the receiver
     * argument, a diagram binding representation MEOop. The second argument
     * is an MEAny containing the breakpoint coordinate. The third argument
     * is the 1-based integer index before which to insert the new breakpoint,
     * counting from the object. The fourth argument is the integer id of
     * the connection within this binding.
     */
    public com.metacase.type.MENull addPoint(com.metacase.type.MEOop receiver, com.metacase.type.MEAny addPoint, int index, int id) throws java.rmi.RemoteException;

    /**
     * Moves the position of a breakpoint in a role representation
     * in the receiver argument, a diagram binding representation MEOop.
     * The second argument is the 1-based integer index of the breakpoint,
     * counting from the object. The third argument is an MEAny containing
     * the new coordinate for the breakpoint. The fourth argument is the
     * integer id of the connection within this binding.
     */
    public com.metacase.type.MENull putPointAtIndex(com.metacase.type.MEOop receiver, int at, com.metacase.type.MEAny putPoint, int id) throws java.rmi.RemoteException;

    /**
     * Removes a breakpoint from a role representation in the receiver
     * argument, a diagram binding representation MEOop. The second argument
     * is an MEAny containing the breakpoint coordinate. The third argument
     * is the integer id of the connection within this binding.
     */
    public com.metacase.type.MEAny removePoint(com.metacase.type.MEOop receiver, com.metacase.type.MEAny removePoint, int id) throws java.rmi.RemoteException;

    /**
     * Returns the object target offset of a connection representation
     * in the receiver argument, a diagram binding representation MEOop.
     * The second argument is the integer id of the connection within this
     * binding.
     */
    public com.metacase.type.MEAny objTargetOffset(com.metacase.type.MEOop receiver, int objTargetOffsetWithId) throws java.rmi.RemoteException;

    /**
     * Sets the target point offset for a role representation in the
     * receiver argument, a diagram binding representation MEOop. The second
     * argument is an MEAny containing the offset coordinate. The third argument
     * is the integer id of the connection within this binding.
     */
    public com.metacase.type.MENull setObjTargetOffset(com.metacase.type.MEOop receiver, com.metacase.type.MEAny objTargetOffset, int id) throws java.rmi.RemoteException;

    /**
     * Returns the isMovable value of a connection representation
     * in the receiver argument, a diagram binding representation MEOop.
     * The second argument is the integer id of the connection within this
     * binding.
     */
    public boolean isMovable(com.metacase.type.MEOop receiver, int isMovableWithId) throws java.rmi.RemoteException;

    /**
     * Sets the isMovable value for a role representation in the receiver
     * argument, a diagram binding representation MEOop. This boolean value
     * indicates whether or not target point offset's value should be interpreted
     * as offset for whole dynamic port (if connected to one) or just as
     * offset for role's connection point. The second argument is an MEAny
     * containing the offset coordinate. The third argument is the integer
     * id of the connection within this binding.
     */
    public com.metacase.type.MENull setIsMovable(com.metacase.type.MEOop receiver, boolean isMovable, int id) throws java.rmi.RemoteException;

    /**
     * Update the receiver, an MEOop of a Diagram, with the objects
     * and bindings that are in the Graph but not this Diagram.
     */
    public com.metacase.type.MENull importGraph(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException;

    /**
     * Returns an MEOopArray of the axis elements on the horizontal
     * axis of the receiver argument, a matrix MEOop.
     */
    public com.metacase.type.MEOop[] hAxis(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException;

    /**
     * Returns an MEOopArray of the axis elements on the vertical
     * axis of the receiver argument, a matrix MEOop.
     */
    public com.metacase.type.MEOop[] vAxis(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException;

    /**
     * Returns the element to select from a binding for display in
     * a cell of the receiver argument, a matrix MEOop. The result returned
     * is a string corresponding to the choice in the View menu: firstRole
     * for the Row Role, secondRole for the Column Role, and relationship
     * for the Relationship.
     */
    public java.lang.String bindSelect(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException;

    /**
     * Sets the element to select from a binding for display in a
     * cell of the receiver argument, a matrix MEOop. The value is a string
     * corresponding to the choice in the View menu: firstRole for the Row
     * Role, secondRole for the Column Role, and relationship for the Relationship.
     */
    public com.metacase.type.MENull setBindSelect(com.metacase.type.MEOop receiver, java.lang.String bindSelect) throws java.rmi.RemoteException;

    /**
     * Returns the cell display mode of the receiver argument, a matrix
     * MEOop. The result returned is a string corresponding to the choice
     * in the Cell menu: displayText, displaySymbol, or displayTextAndSymbol.
     */
    public java.lang.String cellDisplayMode(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException;

    /**
     * Sets the cell display mode of the receiver argument, a matrix
     * MEOop. The value is a string corresponding to the choice in the Cell
     * menu: displayText, displaySymbol, or displayTextAndSymbol.
     */
    public com.metacase.type.MENull setCellDisplayMode(com.metacase.type.MEOop receiver, java.lang.String cellDisplayMode) throws java.rmi.RemoteException;

    /**
     * Returns the cell text display function of the receiver argument,
     * a matrix MEOop. The result returned is a string corresponding to the
     * choice in the Cell | Text Display dialog: userPrintStringWithType,
     * userPrintString, typeName, letter, justX.
     */
    public java.lang.String displayStringSelector(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException;

    /**
     * Sets the cell text display function of the receiver argument,
     * a matrix MEOop. The value is a string corresponding to the choice
     * in the Cell | Text Display dialog: userPrintStringWithType, userPrintString,
     * typeName, letter, justX.
     */
    public com.metacase.type.MENull setDisplayStringSelector(com.metacase.type.MEOop receiver, java.lang.String displayStringSelector) throws java.rmi.RemoteException;

    /**
     * Returns the axis display mode of the receiver argument, a matrix
     * MEOop. The result returned is a string corresponding to the choice
     * in the Axis menu: axesDisplayText, axesDisplaySymbol, or axesDisplayTextAndSymbol.
     */
    public java.lang.String axisDisplayMode(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException;

    /**
     * Sets the axis display mode of the receiver argument, a matrix
     * MEOop. The value is a string corresponding to the choice in the Axis
     * menu: axesDisplayText, axesDisplaySymbol, or axesDisplayTextAndSymbol.
     */
    public com.metacase.type.MENull setAxisDisplayMode(com.metacase.type.MEOop receiver, java.lang.String axisDisplayMode) throws java.rmi.RemoteException;

    /**
     * Returns whether the receiver argument, a matrix MEOop, only
     * shows bindings in cells corresponding to the first role, i.e. whether
     * the View | Directed? menu item is chosen.
     */
    public boolean showFirst(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException;

    /**
     * Sets whether the receiver argument, a matrix MEOop, only shows
     * bindings in cells corresponding to the first role, i.e. whether the
     * View | Directed? menu item is chosen.
     */
    public com.metacase.type.MENull setShowFirst(com.metacase.type.MEOop receiver, boolean showFirst) throws java.rmi.RemoteException;

    /**
     * Returns the width in pixels of the row labels in the receiver
     * argument, a matrix MEOop.
     */
    public int rowLabelsWidth(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException;

    /**
     * Sets the width in pixels of the row labels in the receiver
     * argument, a matrix MEOop.
     */
    public com.metacase.type.MENull setRowLabelsWidth(com.metacase.type.MEOop receiver, int rowLabelsWidth) throws java.rmi.RemoteException;

    /**
     * Returns the text style used by the receiver argument, a matrix
     * MEOop. The result returned is one of the styles shown in Format |
     * Font...
     */
    public java.lang.String textStyleSymbol(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException;

    /**
     * Sets the text style used by the receiver argument, a matrix
     * MEOop. The value is one of the styles shown in Format | Font...
     */
    public com.metacase.type.MENull setTextStyleSymbol(com.metacase.type.MEOop receiver, java.lang.String textStyleSymbol) throws java.rmi.RemoteException;

    /**
     * Add to the receiver argument, a matrix MEOop, a new representation
     * for the Object MEOop. The representation is added to the horizontal
     * or vertical axis, depending on the toAxis argument, before the specified
     * index (1-based). Returns the MEOop of the resulting axis element.
     */
    public com.metacase.type.MEOop addNewAxisEltFor(com.metacase.type.MEOop receiver, com.metacase.type.MEOop addNewRepFor, java.lang.String toAxis, int beforeIndex) throws java.rmi.RemoteException;

    /**
     * Returns the width in pixels of the receiver argument, a matrix
     * axis element MEOop.
     */
    public int getWidth(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException;

    /**
     * Sets the width in pixels of the receiver argument, a matrix
     * axis element MEOop.
     */
    public com.metacase.type.MENull setWidth(com.metacase.type.MEOop receiver, int setWidth) throws java.rmi.RemoteException;

    /**
     * Returns the METype of the object type whose instances are shown
     * in the receiver argument, a table MEOop.
     */
    public com.metacase.type.METype oT(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException;

    /**
     * Returns an MEOopArray containing the object representations
     * in the receiver, a table MEOop.
     */
    public com.metacase.type.MEOop[] baseCollection(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException;

    /**
     * Returns the text style used by the receiver argument, a table
     * MEOop. The result returned is one of the styles shown in Format |
     * Font...
     */
    public java.lang.String font(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException;

    /**
     * Sets the text style used by the receiver argument, a table
     * MEOop. The value is one of the styles shown in Format | Font...
     */
    public com.metacase.type.MENull setFont(com.metacase.type.MEOop receiver, java.lang.String font) throws java.rmi.RemoteException;

    /**
     * Returns an MEAnyArray containing the column widths in pixels
     * in the receiver, a table MEOop.
     */
    public com.metacase.type.MEAny[] gxlWidths(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException;

    /**
     * Sets the column widths in pixels of the receiver, a table MEOop.
     * The value is an MEAnyArray containing either one MEAny integer, which
     * will become the default width for all columns, or as many MEAny integers
     * as there are properties in this table's object type.
     */
    public com.metacase.type.MENull setGxlWidths(com.metacase.type.MEOop receiver, com.metacase.type.MEAny[] gxlWidths) throws java.rmi.RemoteException;

    /**
     * Adds a new object representation to the receiver argument,
     * a table MEOop. The second argument is the MEOop of the object to represent.
     * The third argument is a 1-based integer index of the row before which
     * to insert the new object representation. The return value is the MEOop
     * of the new object representation.
     */
    public com.metacase.type.MENull addNewTableEltFor(com.metacase.type.MEOop receiver, com.metacase.type.MEOop addNewRepFor, int beforeIndex) throws java.rmi.RemoteException;

    /**
     * See the documentation for the corresponding command-line argument
     */
    public com.metacase.type.MENull currentDir(com.metacase.type.MENull receiver, java.lang.String currentDir) throws java.rmi.RemoteException;

    /**
     * See the documentation for the corresponding command-line argument
     */
    public com.metacase.type.MENull fileInPatch(com.metacase.type.MENull receiver, java.lang.String fileInPatch) throws java.rmi.RemoteException;

    /**
     * See the documentation for the corresponding command-line argument
     */
    public com.metacase.type.MENull fileInPatches(com.metacase.type.MENull receiver) throws java.rmi.RemoteException;

    /**
     * See the documentation for the corresponding command-line argument
     */
    public com.metacase.type.MENull abandon(com.metacase.type.MENull receiver) throws java.rmi.RemoteException;

    /**
     * See the documentation for the corresponding command-line argument
     */
    public com.metacase.type.MENull backupToDB(com.metacase.type.MENull receiver, java.lang.String backupToDB, java.lang.String dir) throws java.rmi.RemoteException;

    /**
     * See the documentation for the corresponding command-line argument
     */
    public com.metacase.type.MENull commit(com.metacase.type.MENull receiver) throws java.rmi.RemoteException;

    /**
     * See the documentation for the corresponding command-line argument
     */
    public com.metacase.type.MENull condenseDatabase(com.metacase.type.MENull receiver) throws java.rmi.RemoteException;

    /**
     * See the documentation for the corresponding command-line argument
     */
    public com.metacase.type.MENull condenseVersions(com.metacase.type.MENull receiver) throws java.rmi.RemoteException;

    /**
     * See the documentation for the corresponding command-line argument
     */
    public com.metacase.type.MENull createProject(com.metacase.type.MENull receiver, java.lang.String createProject) throws java.rmi.RemoteException;

    /**
     * See the documentation for the corresponding command-line argument
     */
    public com.metacase.type.MENull document(com.metacase.type.MENull receiver, java.lang.String document, java.lang.String into) throws java.rmi.RemoteException;

    /**
     * See the documentation for the corresponding command-line argument
     */
    public com.metacase.type.MENull documentGraphsInto(com.metacase.type.MENull receiver, java.lang.String documentGraphsInto) throws java.rmi.RemoteException;

    /**
     * See the documentation for the corresponding command-line argument
     */
    public com.metacase.type.MENull evalCode(com.metacase.type.MENull receiver, java.lang.String evalCode) throws java.rmi.RemoteException;

    /**
     * See the documentation for the corresponding command-line argument
     */
    public com.metacase.type.MENull exportName(com.metacase.type.MENull receiver, java.lang.String exportName, java.lang.String type, java.lang.String file) throws java.rmi.RemoteException;

    /**
     * See the documentation for the corresponding command-line argument
     */
    public com.metacase.type.MENull forAll(com.metacase.type.MENull receiver, java.lang.String forAll, java.lang.String run) throws java.rmi.RemoteException;

    /**
     * See the documentation for the corresponding command-line argument
     */
    public com.metacase.type.MENull forName(com.metacase.type.MENull receiver, java.lang.String forName, java.lang.String type, java.lang.String run) throws java.rmi.RemoteException;

    /**
     * See the documentation for the corresponding command-line argument
     */
    public com.metacase.type.MENull login(com.metacase.type.MENull receiver) throws java.rmi.RemoteException;

    /**
     * See the documentation for the corresponding command-line argument
     */
    public com.metacase.type.MENull loginDB(com.metacase.type.MENull receiver, java.lang.String loginDB, java.lang.String user, java.lang.String password) throws java.rmi.RemoteException;

    /**
     * See the documentation for the corresponding command-line argument
     */
    public com.metacase.type.MENull loginNewDB(com.metacase.type.MENull receiver, java.lang.String loginNewDB, java.lang.String dir, java.lang.String user, java.lang.String password) throws java.rmi.RemoteException;

    /**
     * See the documentation for the corresponding command-line argument
     */
    public com.metacase.type.MENull logoutAndExit(com.metacase.type.MENull receiver) throws java.rmi.RemoteException;

    /**
     * See the documentation for the corresponding command-line argument
     */
    public com.metacase.type.MENull maintainDatabase(com.metacase.type.MENull receiver) throws java.rmi.RemoteException;

    /**
     * See the documentation for the corresponding command-line argument
     */
    public com.metacase.type.MENull minimalUI(com.metacase.type.MENull receiver) throws java.rmi.RemoteException;

    /**
     * See the documentation for the corresponding command-line argument
     */
    public com.metacase.type.MENull obsolete(com.metacase.type.MENull receiver, java.lang.String obsolete) throws java.rmi.RemoteException;

    /**
     * See the documentation for the corresponding command-line argument
     */
    public com.metacase.type.MENull openAllProjects(com.metacase.type.MENull receiver) throws java.rmi.RemoteException;

    /**
     * See the documentation for the corresponding command-line argument
     */
    public com.metacase.type.MENull quit(com.metacase.type.MENull receiver) throws java.rmi.RemoteException;

    /**
     * See the documentation for the corresponding command-line argument
     */
    public com.metacase.type.MENull resetVersionHistory(com.metacase.type.MENull receiver) throws java.rmi.RemoteException;

    /**
     * See the documentation for the corresponding command-line argument
     */
    public com.metacase.type.MENull saveWSDL(com.metacase.type.MENull receiver, java.lang.String saveWSDL) throws java.rmi.RemoteException;

    /**
     * See the documentation for the corresponding command-line argument
     */
    public com.metacase.type.MENull setProject(com.metacase.type.MENull receiver, java.lang.String setProject) throws java.rmi.RemoteException;

    /**
     * See the documentation for the corresponding command-line argument
     */
    public com.metacase.type.MENull startAPI(com.metacase.type.MENull receiver) throws java.rmi.RemoteException;

    /**
     * See the documentation for the corresponding command-line argument
     */
    public com.metacase.type.MENull startAPIHostname(com.metacase.type.MENull receiver, java.lang.String startAPIHostname, java.lang.String port, java.lang.String logEvents) throws java.rmi.RemoteException;

    /**
     * See the documentation for the corresponding command-line argument
     */
    public com.metacase.type.MENull stopAPI(com.metacase.type.MENull receiver) throws java.rmi.RemoteException;

    /**
     * See the documentation for the corresponding command-line argument
     */
    public java.lang.String commandLine(com.metacase.type.MENull receiver) throws java.rmi.RemoteException;

    /**
     * See the documentation for the corresponding command-line argument
     */
    public java.lang.String dbDir(com.metacase.type.MENull receiver) throws java.rmi.RemoteException;

    /**
     * See the documentation for the corresponding command-line argument
     */
    public java.lang.String dbName(com.metacase.type.MENull receiver) throws java.rmi.RemoteException;

    /**
     * See the documentation for the corresponding command-line argument
     */
    public java.lang.String defaultProject(com.metacase.type.MENull receiver) throws java.rmi.RemoteException;

    /**
     * See the documentation for the corresponding command-line argument
     */
    public java.lang.String exists(com.metacase.type.MENull receiver, java.lang.String exists) throws java.rmi.RemoteException;

    /**
     * See the documentation for the corresponding command-line argument
     */
    public java.lang.String getCurrentDir(com.metacase.type.MENull receiver) throws java.rmi.RemoteException;

    /**
     * See the documentation for the corresponding command-line argument
     */
    public java.lang.String textForMERL(com.metacase.type.MENull receiver, java.lang.String textForMERL) throws java.rmi.RemoteException;

    /**
     * See the documentation for the corresponding command-line argument
     */
    public java.lang.String unconvertedVersion(com.metacase.type.MENull receiver) throws java.rmi.RemoteException;

    /**
     * See the documentation for the corresponding command-line argument
     */
    public java.lang.String user(com.metacase.type.MENull receiver) throws java.rmi.RemoteException;

    /**
     * See the documentation for the corresponding command-line argument
     */
    public java.lang.String vcsComment(com.metacase.type.MENull receiver) throws java.rmi.RemoteException;

    /**
     * See the documentation for the corresponding command-line argument
     */
    public java.lang.String vcsDirty(com.metacase.type.MENull receiver) throws java.rmi.RemoteException;

    /**
     * See the documentation for the corresponding command-line argument
     */
    public java.lang.String version(com.metacase.type.MENull receiver) throws java.rmi.RemoteException;

    /**
     * See the documentation for the corresponding command-line argument
     */
    public java.lang.String versionVerbose(com.metacase.type.MENull receiver) throws java.rmi.RemoteException;
}
