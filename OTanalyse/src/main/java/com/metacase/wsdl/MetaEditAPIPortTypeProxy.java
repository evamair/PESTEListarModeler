package com.metacase.wsdl;

public class MetaEditAPIPortTypeProxy implements com.metacase.wsdl.MetaEditAPIPortType {
  private String _endpoint = null;
  private com.metacase.wsdl.MetaEditAPIPortType metaEditAPIPortType = null;
  
  public MetaEditAPIPortTypeProxy() {
    _initMetaEditAPIPortTypeProxy();
  }
  
  public MetaEditAPIPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initMetaEditAPIPortTypeProxy();
  }
  
  private void _initMetaEditAPIPortTypeProxy() {
    try {
      metaEditAPIPortType = (new com.metacase.wsdl.MetaEditAPILocator()).getMetaEditAPIPort();
      if (metaEditAPIPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)metaEditAPIPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)metaEditAPIPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (metaEditAPIPortType != null)
      ((javax.xml.rpc.Stub)metaEditAPIPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.metacase.wsdl.MetaEditAPIPortType getMetaEditAPIPortType() {
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType;
  }
  
  public com.metacase.type.MEOop[] allGoodInstances(com.metacase.type.METype receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.allGoodInstances(receiver);
  }
  
  public com.metacase.type.MEOop[] allSimilarInstances(com.metacase.type.METype receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.allSimilarInstances(receiver);
  }
  
  public com.metacase.type.METype subTypeNamed(com.metacase.type.METype receiver, java.lang.String subTypeNamed) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.subTypeNamed(receiver, subTypeNamed);
  }
  
  public com.metacase.type.MEOop[] findString(com.metacase.type.MEOop receiver, java.lang.String findString) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.findString(receiver, findString);
  }
  
  public com.metacase.type.MEOop[] instancesNamed(com.metacase.type.METype receiver, java.lang.String instancesNamed, java.lang.String ofSubTypesNamed) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.instancesNamed(receiver, instancesNamed, ofSubTypesNamed);
  }
  
  public java.lang.String typeName(com.metacase.type.METype receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.typeName(receiver);
  }
  
  public com.metacase.type.METype type(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.type(receiver);
  }
  
  public java.lang.String typeTypeName(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.typeTypeName(receiver);
  }
  
  public java.lang.String userPrintString(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.userPrintString(receiver);
  }
  
  public com.metacase.type.MEAny valueAt(com.metacase.type.MEOop receiver, int valueAt) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.valueAt(receiver, valueAt);
  }
  
  public com.metacase.type.MEAny setValueAt(com.metacase.type.MEOop receiver, int valueAt, com.metacase.type.MEAny put) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.setValueAt(receiver, valueAt, put);
  }
  
  public com.metacase.type.MEAny[] allPropertiesValues(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.allPropertiesValues(receiver);
  }
  
  public com.metacase.type.MEOop[] allProperties(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.allProperties(receiver);
  }
  
  public com.metacase.type.MEAny[] allPropertiesWrapped(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.allPropertiesWrapped(receiver);
  }
  
  public com.metacase.type.MEAny instProps(com.metacase.type.METype receiver, com.metacase.type.MEAny[] propColl, com.metacase.type.MEAny[] valueColl, com.metacase.type.MEAny np, com.metacase.type.MEAny inArea) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.instProps(receiver, propColl, valueColl, np, inArea);
  }
  
  public com.metacase.type.MEAny instPropsLocking(com.metacase.type.METype receiver, com.metacase.type.MEAny[] propCollLocking, com.metacase.type.MEAny[] valueColl, com.metacase.type.MEAny np, com.metacase.type.MEAny inArea) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.instPropsLocking(receiver, propCollLocking, valueColl, np, inArea);
  }
  
  public com.metacase.type.MEOop unsafeNew(com.metacase.type.METype receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.unsafeNew(receiver);
  }
  
  public com.metacase.type.MEAny createGraphDialog(com.metacase.type.METype receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.createGraphDialog(receiver);
  }
  
  public com.metacase.type.MEAny createFromPropertyDialogInArea(com.metacase.type.METype receiver, int createFromPropertyDialogInArea) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.createFromPropertyDialogInArea(receiver, createFromPropertyDialogInArea);
  }
  
  public boolean propertyDialog(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.propertyDialog(receiver);
  }
  
  public java.lang.String allLocalNamesString(com.metacase.type.METype receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.allLocalNamesString(receiver);
  }
  
  public com.metacase.type.MEAny propertyForLocalName(com.metacase.type.MEOop receiver, java.lang.String propertyForLocalName) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.propertyForLocalName(receiver, propertyForLocalName);
  }
  
  public com.metacase.type.MEAny valueForLocalName(com.metacase.type.MEOop receiver, java.lang.String valueForLocalName) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.valueForLocalName(receiver, valueForLocalName);
  }
  
  public com.metacase.type.MEOop[] objectSet(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.objectSet(receiver);
  }
  
  public com.metacase.type.MEOop[] portSet(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.portSet(receiver);
  }
  
  public com.metacase.type.MEOop[] relationshipSet(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.relationshipSet(receiver);
  }
  
  public com.metacase.type.MEOop[] roleSet(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.roleSet(receiver);
  }
  
  public com.metacase.type.MEOop[] bindingSet(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.bindingSet(receiver);
  }
  
  public com.metacase.type.MEOop[] contentsMatchingType(com.metacase.type.MEOop receiver, com.metacase.type.METype contentsMatchingType, boolean allowSubTypes) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.contentsMatchingType(receiver, contentsMatchingType, allowSubTypes);
  }
  
  public com.metacase.type.MEOop[] explodeGraphs(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.explodeGraphs(receiver);
  }
  
  public com.metacase.type.MEOop[] decompGraphs(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.decompGraphs(receiver);
  }
  
  public com.metacase.type.MEOop[] subgraphs(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.subgraphs(receiver);
  }
  
  public com.metacase.type.MEOop addExplode(com.metacase.type.MEOop receiver, com.metacase.type.MEOop addExplode, com.metacase.type.MEOop _for) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.addExplode(receiver, addExplode, _for);
  }
  
  public com.metacase.type.MEOop[] getExplodeGraphsForNP(com.metacase.type.MEOop receiver, com.metacase.type.MEOop getExplodeGraphsForNP) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.getExplodeGraphsForNP(receiver, getExplodeGraphsForNP);
  }
  
  public com.metacase.type.MEOop removeExplode(com.metacase.type.MEOop receiver, com.metacase.type.MEOop removeExplode, com.metacase.type.MEOop _for) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.removeExplode(receiver, removeExplode, _for);
  }
  
  public com.metacase.type.MEAny decompGraph(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.decompGraph(receiver);
  }
  
  public com.metacase.type.MEAny setDecompGraph(com.metacase.type.MEOop receiver, com.metacase.type.MEAny decompGraph) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.setDecompGraph(receiver, decompGraph);
  }
  
  public com.metacase.type.MEOop[] objsForObj(com.metacase.type.MEOop receiver, com.metacase.type.MEOop objsForObj, com.metacase.type.METype ofClass) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.objsForObj(receiver, objsForObj, ofClass);
  }
  
  public com.metacase.type.MEOop[] objsForPort(com.metacase.type.MEOop receiver, com.metacase.type.MEOop objsForPort, com.metacase.type.METype ofClass) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.objsForPort(receiver, objsForPort, ofClass);
  }
  
  public com.metacase.type.MEOop[] objsForRel(com.metacase.type.MEOop receiver, com.metacase.type.MEOop objsForRel, com.metacase.type.METype ofClass) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.objsForRel(receiver, objsForRel, ofClass);
  }
  
  public com.metacase.type.MEOop[] objsForRole(com.metacase.type.MEOop receiver, com.metacase.type.MEOop objsForRole, com.metacase.type.METype ofClass) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.objsForRole(receiver, objsForRole, ofClass);
  }
  
  public com.metacase.type.MEOop[] portsForObj(com.metacase.type.MEOop receiver, com.metacase.type.MEOop portsForObj, com.metacase.type.METype ofClass) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.portsForObj(receiver, portsForObj, ofClass);
  }
  
  public com.metacase.type.MEOop[] portsForPort(com.metacase.type.MEOop receiver, com.metacase.type.MEOop portsForPort, com.metacase.type.METype ofClass) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.portsForPort(receiver, portsForPort, ofClass);
  }
  
  public com.metacase.type.MEOop[] portsForRel(com.metacase.type.MEOop receiver, com.metacase.type.MEOop portsForRel, com.metacase.type.METype ofClass) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.portsForRel(receiver, portsForRel, ofClass);
  }
  
  public com.metacase.type.MEOop[] portsForRole(com.metacase.type.MEOop receiver, com.metacase.type.MEOop portsForRole, com.metacase.type.METype ofClass) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.portsForRole(receiver, portsForRole, ofClass);
  }
  
  public com.metacase.type.MEOop[] relsForObj(com.metacase.type.MEOop receiver, com.metacase.type.MEOop relsForObj, com.metacase.type.METype ofClass) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.relsForObj(receiver, relsForObj, ofClass);
  }
  
  public com.metacase.type.MEOop[] relsForPort(com.metacase.type.MEOop receiver, com.metacase.type.MEOop relsForPort, com.metacase.type.METype ofClass) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.relsForPort(receiver, relsForPort, ofClass);
  }
  
  public com.metacase.type.MEOop[] relsForRel(com.metacase.type.MEOop receiver, com.metacase.type.MEOop relsForRel, com.metacase.type.METype ofClass) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.relsForRel(receiver, relsForRel, ofClass);
  }
  
  public com.metacase.type.MEOop[] relsForRole(com.metacase.type.MEOop receiver, com.metacase.type.MEOop relsForRole, com.metacase.type.METype ofClass) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.relsForRole(receiver, relsForRole, ofClass);
  }
  
  public com.metacase.type.MEOop[] rolesForObj(com.metacase.type.MEOop receiver, com.metacase.type.MEOop rolesForObj, com.metacase.type.METype ofClass) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.rolesForObj(receiver, rolesForObj, ofClass);
  }
  
  public com.metacase.type.MEOop[] rolesForPort(com.metacase.type.MEOop receiver, com.metacase.type.MEOop rolesForPort, com.metacase.type.METype ofClass) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.rolesForPort(receiver, rolesForPort, ofClass);
  }
  
  public com.metacase.type.MEOop[] rolesForRel(com.metacase.type.MEOop receiver, com.metacase.type.MEOop rolesForRel, com.metacase.type.METype ofClass) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.rolesForRel(receiver, rolesForRel, ofClass);
  }
  
  public com.metacase.type.MEOop[] rolesForRole(com.metacase.type.MEOop receiver, com.metacase.type.MEOop rolesForRole, com.metacase.type.METype ofClass) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.rolesForRole(receiver, rolesForRole, ofClass);
  }
  
  public boolean forGraphRun(com.metacase.type.MEOop receiver, java.lang.String forGraphRun) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.forGraphRun(receiver, forGraphRun);
  }
  
  public java.lang.String textForGraphRun(com.metacase.type.MEOop receiver, java.lang.String textForGraphRun, java.lang.String preRun) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.textForGraphRun(receiver, textForGraphRun, preRun);
  }
  
  public java.lang.String textForRun(com.metacase.type.MENull receiver, java.lang.String textForRun, com.metacase.type.MEAny[] stack, com.metacase.type.MEAny[] arguments, java.lang.String preRun) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.textForRun(receiver, textForRun, stack, arguments, preRun);
  }
  
  public java.lang.String generatorNames(com.metacase.type.METype receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.generatorNames(receiver);
  }
  
  public com.metacase.type.MENull open(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.open(receiver);
  }
  
  public com.metacase.type.MENull animate(com.metacase.type.MEOop receiver, com.metacase.type.MEOop animate) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.animate(receiver, animate);
  }
  
  public com.metacase.type.MENull animateAll(com.metacase.type.MEOop receiver, com.metacase.type.MEOop[] animateAll) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.animateAll(receiver, animateAll);
  }
  
  public com.metacase.type.MENull animateNone(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.animateNone(receiver);
  }
  
  public com.metacase.type.MENull refresh(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.refresh(receiver);
  }
  
  public boolean isDirty(com.metacase.type.MENull receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.isDirty(receiver);
  }
  
  public boolean isLogout(com.metacase.type.MENull receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.isLogout(receiver);
  }
  
  public com.metacase.type.MEOop[] copiedObjects(com.metacase.type.MENull receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.copiedObjects(receiver);
  }
  
  public com.metacase.type.MEAny[] waitForBindingCreation(com.metacase.type.MENull receiver, int waitForBindingCreation) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.waitForBindingCreation(receiver, waitForBindingCreation);
  }
  
  public com.metacase.type.MEAny[] waitForBindingFinalization(com.metacase.type.MENull receiver, int waitForBindingFinalization, com.metacase.type.MEOop in) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.waitForBindingFinalization(receiver, waitForBindingFinalization, in);
  }
  
  public com.metacase.type.MEOop[] openedGraphReprs(com.metacase.type.MENull receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.openedGraphReprs(receiver);
  }
  
  public boolean startMemento(com.metacase.type.MENull receiver, java.lang.String startMemento) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.startMemento(receiver, startMemento);
  }
  
  public boolean stopMemento(com.metacase.type.MENull receiver, java.lang.String stopMemento) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.stopMemento(receiver, stopMemento);
  }
  
  public java.lang.String lockAll(com.metacase.type.MENull receiver, com.metacase.type.MEOop[] lockAll) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.lockAll(receiver, lockAll);
  }
  
  public com.metacase.type.MENull delete(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.delete(receiver);
  }
  
  public com.metacase.type.MENull addToGraph(com.metacase.type.MEOop receiver, com.metacase.type.MEOop addToGraph) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.addToGraph(receiver, addToGraph);
  }
  
  public com.metacase.type.MEOop createBinding(com.metacase.type.MEOop receiver, com.metacase.type.METype relType, com.metacase.type.METype[] roleTypes, com.metacase.type.MEOop[] objects) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.createBinding(receiver, relType, roleTypes, objects);
  }
  
  public com.metacase.type.MEOop createBindingWithPorts(com.metacase.type.MEOop receiver, com.metacase.type.METype relType, com.metacase.type.METype[] roleTypes, com.metacase.type.MEAny[] ports, com.metacase.type.MEOop[] objects) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.createBindingWithPorts(receiver, relType, roleTypes, ports, objects);
  }
  
  public boolean removeBinding(com.metacase.type.MEOop receiver, com.metacase.type.MEOop removeBinding) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.removeBinding(receiver, removeBinding);
  }
  
  public com.metacase.type.MEOop relationship(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.relationship(receiver);
  }
  
  public com.metacase.type.MEOop[] roles(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.roles(receiver);
  }
  
  public com.metacase.type.MEAny[] portSlots(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.portSlots(receiver);
  }
  
  public com.metacase.type.MEOop[] objects(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.objects(receiver);
  }
  
  public com.metacase.type.MEAny[] connectionIds(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.connectionIds(receiver);
  }
  
  public com.metacase.type.MEOop[] diagrams(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.diagrams(receiver);
  }
  
  public com.metacase.type.MEOop[] matrices(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.matrices(receiver);
  }
  
  public com.metacase.type.MEOop[] tables(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.tables(receiver);
  }
  
  public com.metacase.type.MEOop newDiagram(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.newDiagram(receiver);
  }
  
  public com.metacase.type.MEOop newMatrix(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.newMatrix(receiver);
  }
  
  public com.metacase.type.MEOop newTable(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.newTable(receiver);
  }
  
  public com.metacase.type.MEOop inst(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.inst(receiver);
  }
  
  public com.metacase.type.MEOop[] repSet(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.repSet(receiver);
  }
  
  public com.metacase.type.MEOop reprGraph(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.reprGraph(receiver);
  }
  
  public com.metacase.type.MEOop remove(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.remove(receiver);
  }
  
  public java.util.Calendar timeStamp(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.timeStamp(receiver);
  }
  
  public com.metacase.type.MENull setTimeStamp(com.metacase.type.MEOop receiver, java.util.Calendar timeStamp) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.setTimeStamp(receiver, timeStamp);
  }
  
  public com.metacase.type.MEOop[] objectReprs(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.objectReprs(receiver);
  }
  
  public com.metacase.type.MEOop[] bindingReprs(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.bindingReprs(receiver);
  }
  
  public com.metacase.type.MEAny grid(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.grid(receiver);
  }
  
  public com.metacase.type.MENull setGrid(com.metacase.type.MEOop receiver, com.metacase.type.MEAny grid) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.setGrid(receiver, grid);
  }
  
  public boolean displayGrid(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.displayGrid(receiver);
  }
  
  public com.metacase.type.MENull setDisplayGrid(com.metacase.type.MEOop receiver, boolean displayGrid) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.setDisplayGrid(receiver, displayGrid);
  }
  
  public boolean useGrid(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.useGrid(receiver);
  }
  
  public com.metacase.type.MENull setUseGrid(com.metacase.type.MEOop receiver, boolean useGrid) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.setUseGrid(receiver, useGrid);
  }
  
  public com.metacase.type.MEAny place(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.place(receiver);
  }
  
  public com.metacase.type.MENull setPlace(com.metacase.type.MEOop receiver, com.metacase.type.MEAny place) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.setPlace(receiver, place);
  }
  
  public com.metacase.type.MEAny scale(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.scale(receiver);
  }
  
  public com.metacase.type.MENull setScale(com.metacase.type.MEOop receiver, com.metacase.type.MEAny scale) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.setScale(receiver, scale);
  }
  
  public boolean isStraight(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.isStraight(receiver);
  }
  
  public com.metacase.type.MENull setIsStraight(com.metacase.type.MEOop receiver, boolean isStraight) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.setIsStraight(receiver, isStraight);
  }
  
  public com.metacase.type.MENull straighten(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.straighten(receiver);
  }
  
  public com.metacase.type.MENull layout(com.metacase.type.MEOop receiver, com.metacase.type.METype layoutRelationship, com.metacase.type.METype fromRole, com.metacase.type.METype toRole, java.lang.String direction, boolean manhattan) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.layout(receiver, layoutRelationship, fromRole, toRole, direction, manhattan);
  }
  
  public com.metacase.type.MEOop addNewObjectRepFor(com.metacase.type.MEOop receiver, com.metacase.type.MEOop addNewObjectRepFor, int beforeIndex, com.metacase.type.MEAny place) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.addNewObjectRepFor(receiver, addNewObjectRepFor, beforeIndex, place);
  }
  
  public com.metacase.type.MEOop addNewBindingRepFor(com.metacase.type.MEOop receiver, com.metacase.type.MEOop addNewBindingRepFor, int beforeIndex, com.metacase.type.MEAny place) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.addNewBindingRepFor(receiver, addNewBindingRepFor, beforeIndex, place);
  }
  
  public com.metacase.type.MEAny[] connectionReprIds(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.connectionReprIds(receiver);
  }
  
  public com.metacase.type.MEAny[] breakpoints(com.metacase.type.MEOop receiver, int breakpointsWithId) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.breakpoints(receiver, breakpointsWithId);
  }
  
  public com.metacase.type.MENull setBreakpoints(com.metacase.type.MEOop receiver, com.metacase.type.MEAny[] setBreakpoints, int id) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.setBreakpoints(receiver, setBreakpoints, id);
  }
  
  public com.metacase.type.MENull addPoint(com.metacase.type.MEOop receiver, com.metacase.type.MEAny addPoint, int index, int id) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.addPoint(receiver, addPoint, index, id);
  }
  
  public com.metacase.type.MENull putPointAtIndex(com.metacase.type.MEOop receiver, int at, com.metacase.type.MEAny putPoint, int id) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.putPointAtIndex(receiver, at, putPoint, id);
  }
  
  public com.metacase.type.MEAny removePoint(com.metacase.type.MEOop receiver, com.metacase.type.MEAny removePoint, int id) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.removePoint(receiver, removePoint, id);
  }
  
  public com.metacase.type.MEAny objTargetOffset(com.metacase.type.MEOop receiver, int objTargetOffsetWithId) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.objTargetOffset(receiver, objTargetOffsetWithId);
  }
  
  public com.metacase.type.MENull setObjTargetOffset(com.metacase.type.MEOop receiver, com.metacase.type.MEAny objTargetOffset, int id) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.setObjTargetOffset(receiver, objTargetOffset, id);
  }
  
  public boolean isMovable(com.metacase.type.MEOop receiver, int isMovableWithId) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.isMovable(receiver, isMovableWithId);
  }
  
  public com.metacase.type.MENull setIsMovable(com.metacase.type.MEOop receiver, boolean isMovable, int id) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.setIsMovable(receiver, isMovable, id);
  }
  
  public com.metacase.type.MENull importGraph(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.importGraph(receiver);
  }
  
  public com.metacase.type.MEOop[] hAxis(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.hAxis(receiver);
  }
  
  public com.metacase.type.MEOop[] vAxis(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.vAxis(receiver);
  }
  
  public java.lang.String bindSelect(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.bindSelect(receiver);
  }
  
  public com.metacase.type.MENull setBindSelect(com.metacase.type.MEOop receiver, java.lang.String bindSelect) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.setBindSelect(receiver, bindSelect);
  }
  
  public java.lang.String cellDisplayMode(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.cellDisplayMode(receiver);
  }
  
  public com.metacase.type.MENull setCellDisplayMode(com.metacase.type.MEOop receiver, java.lang.String cellDisplayMode) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.setCellDisplayMode(receiver, cellDisplayMode);
  }
  
  public java.lang.String displayStringSelector(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.displayStringSelector(receiver);
  }
  
  public com.metacase.type.MENull setDisplayStringSelector(com.metacase.type.MEOop receiver, java.lang.String displayStringSelector) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.setDisplayStringSelector(receiver, displayStringSelector);
  }
  
  public java.lang.String axisDisplayMode(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.axisDisplayMode(receiver);
  }
  
  public com.metacase.type.MENull setAxisDisplayMode(com.metacase.type.MEOop receiver, java.lang.String axisDisplayMode) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.setAxisDisplayMode(receiver, axisDisplayMode);
  }
  
  public boolean showFirst(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.showFirst(receiver);
  }
  
  public com.metacase.type.MENull setShowFirst(com.metacase.type.MEOop receiver, boolean showFirst) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.setShowFirst(receiver, showFirst);
  }
  
  public int rowLabelsWidth(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.rowLabelsWidth(receiver);
  }
  
  public com.metacase.type.MENull setRowLabelsWidth(com.metacase.type.MEOop receiver, int rowLabelsWidth) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.setRowLabelsWidth(receiver, rowLabelsWidth);
  }
  
  public java.lang.String textStyleSymbol(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.textStyleSymbol(receiver);
  }
  
  public com.metacase.type.MENull setTextStyleSymbol(com.metacase.type.MEOop receiver, java.lang.String textStyleSymbol) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.setTextStyleSymbol(receiver, textStyleSymbol);
  }
  
  public com.metacase.type.MEOop addNewAxisEltFor(com.metacase.type.MEOop receiver, com.metacase.type.MEOop addNewRepFor, java.lang.String toAxis, int beforeIndex) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.addNewAxisEltFor(receiver, addNewRepFor, toAxis, beforeIndex);
  }
  
  public int getWidth(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.getWidth(receiver);
  }
  
  public com.metacase.type.MENull setWidth(com.metacase.type.MEOop receiver, int setWidth) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.setWidth(receiver, setWidth);
  }
  
  public com.metacase.type.METype oT(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.oT(receiver);
  }
  
  public com.metacase.type.MEOop[] baseCollection(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.baseCollection(receiver);
  }
  
  public java.lang.String font(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.font(receiver);
  }
  
  public com.metacase.type.MENull setFont(com.metacase.type.MEOop receiver, java.lang.String font) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.setFont(receiver, font);
  }
  
  public com.metacase.type.MEAny[] gxlWidths(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.gxlWidths(receiver);
  }
  
  public com.metacase.type.MENull setGxlWidths(com.metacase.type.MEOop receiver, com.metacase.type.MEAny[] gxlWidths) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.setGxlWidths(receiver, gxlWidths);
  }
  
  public com.metacase.type.MENull addNewTableEltFor(com.metacase.type.MEOop receiver, com.metacase.type.MEOop addNewRepFor, int beforeIndex) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.addNewTableEltFor(receiver, addNewRepFor, beforeIndex);
  }
  
  public com.metacase.type.MENull currentDir(com.metacase.type.MENull receiver, java.lang.String currentDir) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.currentDir(receiver, currentDir);
  }
  
  public com.metacase.type.MENull fileInPatch(com.metacase.type.MENull receiver, java.lang.String fileInPatch) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.fileInPatch(receiver, fileInPatch);
  }
  
  public com.metacase.type.MENull fileInPatches(com.metacase.type.MENull receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.fileInPatches(receiver);
  }
  
  public com.metacase.type.MENull abandon(com.metacase.type.MENull receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.abandon(receiver);
  }
  
  public com.metacase.type.MENull backupToDB(com.metacase.type.MENull receiver, java.lang.String backupToDB, java.lang.String dir) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.backupToDB(receiver, backupToDB, dir);
  }
  
  public com.metacase.type.MENull commit(com.metacase.type.MENull receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.commit(receiver);
  }
  
  public com.metacase.type.MENull condenseDatabase(com.metacase.type.MENull receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.condenseDatabase(receiver);
  }
  
  public com.metacase.type.MENull condenseVersions(com.metacase.type.MENull receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.condenseVersions(receiver);
  }
  
  public com.metacase.type.MENull createProject(com.metacase.type.MENull receiver, java.lang.String createProject) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.createProject(receiver, createProject);
  }
  
  public com.metacase.type.MENull document(com.metacase.type.MENull receiver, java.lang.String document, java.lang.String into) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.document(receiver, document, into);
  }
  
  public com.metacase.type.MENull documentGraphsInto(com.metacase.type.MENull receiver, java.lang.String documentGraphsInto) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.documentGraphsInto(receiver, documentGraphsInto);
  }
  
  public com.metacase.type.MENull evalCode(com.metacase.type.MENull receiver, java.lang.String evalCode) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.evalCode(receiver, evalCode);
  }
  
  public com.metacase.type.MENull exportName(com.metacase.type.MENull receiver, java.lang.String exportName, java.lang.String type, java.lang.String file) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.exportName(receiver, exportName, type, file);
  }
  
  public com.metacase.type.MENull forAll(com.metacase.type.MENull receiver, java.lang.String forAll, java.lang.String run) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.forAll(receiver, forAll, run);
  }
  
  public com.metacase.type.MENull forName(com.metacase.type.MENull receiver, java.lang.String forName, java.lang.String type, java.lang.String run) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.forName(receiver, forName, type, run);
  }
  
  public com.metacase.type.MENull login(com.metacase.type.MENull receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.login(receiver);
  }
  
  public com.metacase.type.MENull loginDB(com.metacase.type.MENull receiver, java.lang.String loginDB, java.lang.String user, java.lang.String password) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.loginDB(receiver, loginDB, user, password);
  }
  
  public com.metacase.type.MENull loginNewDB(com.metacase.type.MENull receiver, java.lang.String loginNewDB, java.lang.String dir, java.lang.String user, java.lang.String password) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.loginNewDB(receiver, loginNewDB, dir, user, password);
  }
  
  public com.metacase.type.MENull logoutAndExit(com.metacase.type.MENull receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.logoutAndExit(receiver);
  }
  
  public com.metacase.type.MENull maintainDatabase(com.metacase.type.MENull receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.maintainDatabase(receiver);
  }
  
  public com.metacase.type.MENull minimalUI(com.metacase.type.MENull receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.minimalUI(receiver);
  }
  
  public com.metacase.type.MENull obsolete(com.metacase.type.MENull receiver, java.lang.String obsolete) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.obsolete(receiver, obsolete);
  }
  
  public com.metacase.type.MENull openAllProjects(com.metacase.type.MENull receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.openAllProjects(receiver);
  }
  
  public com.metacase.type.MENull quit(com.metacase.type.MENull receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.quit(receiver);
  }
  
  public com.metacase.type.MENull resetVersionHistory(com.metacase.type.MENull receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.resetVersionHistory(receiver);
  }
  
  public com.metacase.type.MENull saveWSDL(com.metacase.type.MENull receiver, java.lang.String saveWSDL) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.saveWSDL(receiver, saveWSDL);
  }
  
  public com.metacase.type.MENull setProject(com.metacase.type.MENull receiver, java.lang.String setProject) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.setProject(receiver, setProject);
  }
  
  public com.metacase.type.MENull startAPI(com.metacase.type.MENull receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.startAPI(receiver);
  }
  
  public com.metacase.type.MENull startAPIHostname(com.metacase.type.MENull receiver, java.lang.String startAPIHostname, java.lang.String port, java.lang.String logEvents) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.startAPIHostname(receiver, startAPIHostname, port, logEvents);
  }
  
  public com.metacase.type.MENull stopAPI(com.metacase.type.MENull receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.stopAPI(receiver);
  }
  
  public java.lang.String commandLine(com.metacase.type.MENull receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.commandLine(receiver);
  }
  
  public java.lang.String dbDir(com.metacase.type.MENull receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.dbDir(receiver);
  }
  
  public java.lang.String dbName(com.metacase.type.MENull receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.dbName(receiver);
  }
  
  public java.lang.String defaultProject(com.metacase.type.MENull receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.defaultProject(receiver);
  }
  
  public java.lang.String exists(com.metacase.type.MENull receiver, java.lang.String exists) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.exists(receiver, exists);
  }
  
  public java.lang.String getCurrentDir(com.metacase.type.MENull receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.getCurrentDir(receiver);
  }
  
  public java.lang.String textForMERL(com.metacase.type.MENull receiver, java.lang.String textForMERL) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.textForMERL(receiver, textForMERL);
  }
  
  public java.lang.String unconvertedVersion(com.metacase.type.MENull receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.unconvertedVersion(receiver);
  }
  
  public java.lang.String user(com.metacase.type.MENull receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.user(receiver);
  }
  
  public java.lang.String vcsComment(com.metacase.type.MENull receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.vcsComment(receiver);
  }
  
  public java.lang.String vcsDirty(com.metacase.type.MENull receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.vcsDirty(receiver);
  }
  
  public java.lang.String version(com.metacase.type.MENull receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.version(receiver);
  }
  
  public java.lang.String versionVerbose(com.metacase.type.MENull receiver) throws java.rmi.RemoteException{
    if (metaEditAPIPortType == null)
      _initMetaEditAPIPortTypeProxy();
    return metaEditAPIPortType.versionVerbose(receiver);
  }
  
  
}