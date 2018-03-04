/**
 * MetaEditAPISoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.metacase.wsdl;

public class MetaEditAPISoapBindingStub extends org.apache.axis.client.Stub implements com.metacase.wsdl.MetaEditAPIPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[191];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
        _initOperationDesc6();
        _initOperationDesc7();
        _initOperationDesc8();
        _initOperationDesc9();
        _initOperationDesc10();
        _initOperationDesc11();
        _initOperationDesc12();
        _initOperationDesc13();
        _initOperationDesc14();
        _initOperationDesc15();
        _initOperationDesc16();
        _initOperationDesc17();
        _initOperationDesc18();
        _initOperationDesc19();
        _initOperationDesc20();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("allGoodInstances");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "METype"), com.metacase.type.METype.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEOopArray"));
        oper.setReturnClass(com.metacase.type.MEOop[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("allSimilarInstances");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "METype"), com.metacase.type.METype.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEOopArray"));
        oper.setReturnClass(com.metacase.type.MEOop[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("subTypeNamed");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "METype"), com.metacase.type.METype.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "subTypeNamed"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "METype"));
        oper.setReturnClass(com.metacase.type.METype.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findString");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "findString"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEOopArray"));
        oper.setReturnClass(com.metacase.type.MEOop[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("instancesNamed");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "METype"), com.metacase.type.METype.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "instancesNamed"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ofSubTypesNamed"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEOopArray"));
        oper.setReturnClass(com.metacase.type.MEOop[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("typeName");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "METype"), com.metacase.type.METype.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("type");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "METype"));
        oper.setReturnClass(com.metacase.type.METype.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("typeTypeName");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("userPrintString");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("valueAt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "valueAt"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEAny"));
        oper.setReturnClass(com.metacase.type.MEAny.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setValueAt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "valueAt"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "put"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEAny"), com.metacase.type.MEAny.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEAny"));
        oper.setReturnClass(com.metacase.type.MEAny.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("allPropertiesValues");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEAnyArray"));
        oper.setReturnClass(com.metacase.type.MEAny[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("allProperties");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEOopArray"));
        oper.setReturnClass(com.metacase.type.MEOop[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("allPropertiesWrapped");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEAnyArray"));
        oper.setReturnClass(com.metacase.type.MEAny[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("instProps");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "METype"), com.metacase.type.METype.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "propColl"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEAnyArray"), com.metacase.type.MEAny[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "valueColl"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEAnyArray"), com.metacase.type.MEAny[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "np"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEAny"), com.metacase.type.MEAny.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "inArea"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEAny"), com.metacase.type.MEAny.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEAny"));
        oper.setReturnClass(com.metacase.type.MEAny.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("instPropsLocking");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "METype"), com.metacase.type.METype.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "propCollLocking"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEAnyArray"), com.metacase.type.MEAny[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "valueColl"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEAnyArray"), com.metacase.type.MEAny[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "np"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEAny"), com.metacase.type.MEAny.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "inArea"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEAny"), com.metacase.type.MEAny.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEAny"));
        oper.setReturnClass(com.metacase.type.MEAny.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("unsafeNew");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "METype"), com.metacase.type.METype.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"));
        oper.setReturnClass(com.metacase.type.MEOop.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createGraphDialog");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "METype"), com.metacase.type.METype.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEAny"));
        oper.setReturnClass(com.metacase.type.MEAny.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createFromPropertyDialogInArea");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "METype"), com.metacase.type.METype.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "createFromPropertyDialogInArea"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEAny"));
        oper.setReturnClass(com.metacase.type.MEAny.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("propertyDialog");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("allLocalNamesString");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "METype"), com.metacase.type.METype.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("propertyForLocalName");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "propertyForLocalName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEAny"));
        oper.setReturnClass(com.metacase.type.MEAny.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("valueForLocalName");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "valueForLocalName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEAny"));
        oper.setReturnClass(com.metacase.type.MEAny.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("objectSet");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEOopArray"));
        oper.setReturnClass(com.metacase.type.MEOop[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("portSet");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEOopArray"));
        oper.setReturnClass(com.metacase.type.MEOop[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("relationshipSet");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEOopArray"));
        oper.setReturnClass(com.metacase.type.MEOop[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("roleSet");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEOopArray"));
        oper.setReturnClass(com.metacase.type.MEOop[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("bindingSet");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEOopArray"));
        oper.setReturnClass(com.metacase.type.MEOop[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("contentsMatchingType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "contentsMatchingType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "METype"), com.metacase.type.METype.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "allowSubTypes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEOopArray"));
        oper.setReturnClass(com.metacase.type.MEOop[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("explodeGraphs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEOopArray"));
        oper.setReturnClass(com.metacase.type.MEOop[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("decompGraphs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEOopArray"));
        oper.setReturnClass(com.metacase.type.MEOop[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("subgraphs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEOopArray"));
        oper.setReturnClass(com.metacase.type.MEOop[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addExplode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "addExplode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "for"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"));
        oper.setReturnClass(com.metacase.type.MEOop.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getExplodeGraphsForNP");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "getExplodeGraphsForNP"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEOopArray"));
        oper.setReturnClass(com.metacase.type.MEOop[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removeExplode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "removeExplode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "for"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"));
        oper.setReturnClass(com.metacase.type.MEOop.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("decompGraph");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEAny"));
        oper.setReturnClass(com.metacase.type.MEAny.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setDecompGraph");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "decompGraph"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEAny"), com.metacase.type.MEAny.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEAny"));
        oper.setReturnClass(com.metacase.type.MEAny.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("objsForObj");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "objsForObj"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ofClass"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "METype"), com.metacase.type.METype.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEOopArray"));
        oper.setReturnClass(com.metacase.type.MEOop[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("objsForPort");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "objsForPort"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ofClass"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "METype"), com.metacase.type.METype.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEOopArray"));
        oper.setReturnClass(com.metacase.type.MEOop[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("objsForRel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "objsForRel"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ofClass"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "METype"), com.metacase.type.METype.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEOopArray"));
        oper.setReturnClass(com.metacase.type.MEOop[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("objsForRole");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "objsForRole"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ofClass"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "METype"), com.metacase.type.METype.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEOopArray"));
        oper.setReturnClass(com.metacase.type.MEOop[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("portsForObj");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "portsForObj"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ofClass"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "METype"), com.metacase.type.METype.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEOopArray"));
        oper.setReturnClass(com.metacase.type.MEOop[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("portsForPort");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "portsForPort"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ofClass"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "METype"), com.metacase.type.METype.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEOopArray"));
        oper.setReturnClass(com.metacase.type.MEOop[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("portsForRel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "portsForRel"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ofClass"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "METype"), com.metacase.type.METype.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEOopArray"));
        oper.setReturnClass(com.metacase.type.MEOop[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("portsForRole");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "portsForRole"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ofClass"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "METype"), com.metacase.type.METype.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEOopArray"));
        oper.setReturnClass(com.metacase.type.MEOop[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("relsForObj");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "relsForObj"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ofClass"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "METype"), com.metacase.type.METype.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEOopArray"));
        oper.setReturnClass(com.metacase.type.MEOop[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("relsForPort");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "relsForPort"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ofClass"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "METype"), com.metacase.type.METype.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEOopArray"));
        oper.setReturnClass(com.metacase.type.MEOop[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("relsForRel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "relsForRel"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ofClass"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "METype"), com.metacase.type.METype.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEOopArray"));
        oper.setReturnClass(com.metacase.type.MEOop[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("relsForRole");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "relsForRole"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ofClass"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "METype"), com.metacase.type.METype.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEOopArray"));
        oper.setReturnClass(com.metacase.type.MEOop[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("rolesForObj");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rolesForObj"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ofClass"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "METype"), com.metacase.type.METype.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEOopArray"));
        oper.setReturnClass(com.metacase.type.MEOop[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[49] = oper;

    }

    private static void _initOperationDesc6(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("rolesForPort");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rolesForPort"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ofClass"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "METype"), com.metacase.type.METype.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEOopArray"));
        oper.setReturnClass(com.metacase.type.MEOop[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[50] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("rolesForRel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rolesForRel"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ofClass"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "METype"), com.metacase.type.METype.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEOopArray"));
        oper.setReturnClass(com.metacase.type.MEOop[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[51] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("rolesForRole");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rolesForRole"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ofClass"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "METype"), com.metacase.type.METype.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEOopArray"));
        oper.setReturnClass(com.metacase.type.MEOop[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[52] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("forGraphRun");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "forGraphRun"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[53] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("textForGraphRun");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "textForGraphRun"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "preRun"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[54] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("textForRun");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MENull"), com.metacase.type.MENull.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "textForRun"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "stack"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEAnyArray"), com.metacase.type.MEAny[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arguments"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEAnyArray"), com.metacase.type.MEAny[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "preRun"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[55] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("generatorNames");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "METype"), com.metacase.type.METype.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[56] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("open");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MENull"));
        oper.setReturnClass(com.metacase.type.MENull.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[57] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("animate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "animate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MENull"));
        oper.setReturnClass(com.metacase.type.MENull.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[58] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("animateAll");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "animateAll"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOopArray"), com.metacase.type.MEOop[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MENull"));
        oper.setReturnClass(com.metacase.type.MENull.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[59] = oper;

    }

    private static void _initOperationDesc7(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("animateNone");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MENull"));
        oper.setReturnClass(com.metacase.type.MENull.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[60] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("refresh");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MENull"));
        oper.setReturnClass(com.metacase.type.MENull.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[61] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("isDirty");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MENull"), com.metacase.type.MENull.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[62] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("isLogout");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MENull"), com.metacase.type.MENull.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[63] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("copiedObjects");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MENull"), com.metacase.type.MENull.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEOopArray"));
        oper.setReturnClass(com.metacase.type.MEOop[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[64] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("waitForBindingCreation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MENull"), com.metacase.type.MENull.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "waitForBindingCreation"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEAnyArray"));
        oper.setReturnClass(com.metacase.type.MEAny[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[65] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("waitForBindingFinalization");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MENull"), com.metacase.type.MENull.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "waitForBindingFinalization"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEAnyArray"));
        oper.setReturnClass(com.metacase.type.MEAny[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[66] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("openedGraphReprs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MENull"), com.metacase.type.MENull.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEOopArray"));
        oper.setReturnClass(com.metacase.type.MEOop[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[67] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("startMemento");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MENull"), com.metacase.type.MENull.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "startMemento"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[68] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("stopMemento");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MENull"), com.metacase.type.MENull.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "stopMemento"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[69] = oper;

    }

    private static void _initOperationDesc8(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("lockAll");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MENull"), com.metacase.type.MENull.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "lockAll"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOopArray"), com.metacase.type.MEOop[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[70] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("delete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MENull"));
        oper.setReturnClass(com.metacase.type.MENull.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[71] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addToGraph");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "addToGraph"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MENull"));
        oper.setReturnClass(com.metacase.type.MENull.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[72] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createBinding");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "relType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "METype"), com.metacase.type.METype.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "roleTypes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "METypeArray"), com.metacase.type.METype[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "objects"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOopArray"), com.metacase.type.MEOop[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"));
        oper.setReturnClass(com.metacase.type.MEOop.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[73] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createBindingWithPorts");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "relType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "METype"), com.metacase.type.METype.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "roleTypes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "METypeArray"), com.metacase.type.METype[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ports"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEAnyArray"), com.metacase.type.MEAny[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "objects"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOopArray"), com.metacase.type.MEOop[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"));
        oper.setReturnClass(com.metacase.type.MEOop.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[74] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removeBinding");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "removeBinding"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[75] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("relationship");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"));
        oper.setReturnClass(com.metacase.type.MEOop.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[76] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("roles");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEOopArray"));
        oper.setReturnClass(com.metacase.type.MEOop[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[77] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("portSlots");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEAnyArray"));
        oper.setReturnClass(com.metacase.type.MEAny[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[78] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("objects");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEOopArray"));
        oper.setReturnClass(com.metacase.type.MEOop[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[79] = oper;

    }

    private static void _initOperationDesc9(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("connectionIds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEAnyArray"));
        oper.setReturnClass(com.metacase.type.MEAny[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[80] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("diagrams");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEOopArray"));
        oper.setReturnClass(com.metacase.type.MEOop[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[81] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("matrices");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEOopArray"));
        oper.setReturnClass(com.metacase.type.MEOop[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[82] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("tables");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEOopArray"));
        oper.setReturnClass(com.metacase.type.MEOop[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[83] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("newDiagram");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"));
        oper.setReturnClass(com.metacase.type.MEOop.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[84] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("newMatrix");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"));
        oper.setReturnClass(com.metacase.type.MEOop.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[85] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("newTable");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"));
        oper.setReturnClass(com.metacase.type.MEOop.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[86] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("inst");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"));
        oper.setReturnClass(com.metacase.type.MEOop.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[87] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("repSet");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEOopArray"));
        oper.setReturnClass(com.metacase.type.MEOop[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[88] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("reprGraph");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"));
        oper.setReturnClass(com.metacase.type.MEOop.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[89] = oper;

    }

    private static void _initOperationDesc10(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("remove");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"));
        oper.setReturnClass(com.metacase.type.MEOop.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[90] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("timeStamp");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        oper.setReturnClass(java.util.Calendar.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[91] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setTimeStamp");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "timeStamp"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MENull"));
        oper.setReturnClass(com.metacase.type.MENull.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[92] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("objectReprs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEOopArray"));
        oper.setReturnClass(com.metacase.type.MEOop[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[93] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("bindingReprs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEOopArray"));
        oper.setReturnClass(com.metacase.type.MEOop[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[94] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("grid");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEAny"));
        oper.setReturnClass(com.metacase.type.MEAny.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[95] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setGrid");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "grid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEAny"), com.metacase.type.MEAny.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MENull"));
        oper.setReturnClass(com.metacase.type.MENull.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[96] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("displayGrid");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[97] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setDisplayGrid");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "displayGrid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MENull"));
        oper.setReturnClass(com.metacase.type.MENull.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[98] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("useGrid");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[99] = oper;

    }

    private static void _initOperationDesc11(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setUseGrid");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "useGrid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MENull"));
        oper.setReturnClass(com.metacase.type.MENull.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[100] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("place");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEAny"));
        oper.setReturnClass(com.metacase.type.MEAny.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[101] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setPlace");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "place"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEAny"), com.metacase.type.MEAny.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MENull"));
        oper.setReturnClass(com.metacase.type.MENull.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[102] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("scale");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEAny"));
        oper.setReturnClass(com.metacase.type.MEAny.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[103] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setScale");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "scale"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEAny"), com.metacase.type.MEAny.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MENull"));
        oper.setReturnClass(com.metacase.type.MENull.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[104] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("isStraight");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[105] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setIsStraight");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "isStraight"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MENull"));
        oper.setReturnClass(com.metacase.type.MENull.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[106] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("straighten");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MENull"));
        oper.setReturnClass(com.metacase.type.MENull.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[107] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("layout");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "layoutRelationship"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "METype"), com.metacase.type.METype.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fromRole"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "METype"), com.metacase.type.METype.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "toRole"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "METype"), com.metacase.type.METype.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "direction"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "manhattan"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MENull"));
        oper.setReturnClass(com.metacase.type.MENull.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[108] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addNewObjectRepFor");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "addNewObjectRepFor"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "beforeIndex"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "place"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEAny"), com.metacase.type.MEAny.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"));
        oper.setReturnClass(com.metacase.type.MEOop.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[109] = oper;

    }

    private static void _initOperationDesc12(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addNewBindingRepFor");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "addNewBindingRepFor"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "beforeIndex"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "place"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEAny"), com.metacase.type.MEAny.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"));
        oper.setReturnClass(com.metacase.type.MEOop.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[110] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("connectionReprIds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEAnyArray"));
        oper.setReturnClass(com.metacase.type.MEAny[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[111] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("breakpoints");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "breakpointsWithId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEAnyArray"));
        oper.setReturnClass(com.metacase.type.MEAny[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[112] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setBreakpoints");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "setBreakpoints"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEAnyArray"), com.metacase.type.MEAny[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MENull"));
        oper.setReturnClass(com.metacase.type.MENull.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[113] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addPoint");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "addPoint"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEAny"), com.metacase.type.MEAny.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "index"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MENull"));
        oper.setReturnClass(com.metacase.type.MENull.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[114] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("putPointAtIndex");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "at"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "putPoint"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEAny"), com.metacase.type.MEAny.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MENull"));
        oper.setReturnClass(com.metacase.type.MENull.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[115] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removePoint");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "removePoint"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEAny"), com.metacase.type.MEAny.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEAny"));
        oper.setReturnClass(com.metacase.type.MEAny.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[116] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("objTargetOffset");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "objTargetOffsetWithId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEAny"));
        oper.setReturnClass(com.metacase.type.MEAny.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[117] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setObjTargetOffset");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "objTargetOffset"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEAny"), com.metacase.type.MEAny.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MENull"));
        oper.setReturnClass(com.metacase.type.MENull.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[118] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("isMovable");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "isMovableWithId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[119] = oper;

    }

    private static void _initOperationDesc13(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setIsMovable");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "isMovable"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MENull"));
        oper.setReturnClass(com.metacase.type.MENull.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[120] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("importGraph");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MENull"));
        oper.setReturnClass(com.metacase.type.MENull.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[121] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("hAxis");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEOopArray"));
        oper.setReturnClass(com.metacase.type.MEOop[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[122] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("vAxis");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEOopArray"));
        oper.setReturnClass(com.metacase.type.MEOop[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[123] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("bindSelect");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[124] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setBindSelect");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "bindSelect"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MENull"));
        oper.setReturnClass(com.metacase.type.MENull.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[125] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cellDisplayMode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[126] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setCellDisplayMode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cellDisplayMode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MENull"));
        oper.setReturnClass(com.metacase.type.MENull.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[127] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("displayStringSelector");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[128] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setDisplayStringSelector");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "displayStringSelector"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MENull"));
        oper.setReturnClass(com.metacase.type.MENull.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[129] = oper;

    }

    private static void _initOperationDesc14(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("axisDisplayMode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[130] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setAxisDisplayMode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "axisDisplayMode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MENull"));
        oper.setReturnClass(com.metacase.type.MENull.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[131] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("showFirst");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[132] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setShowFirst");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "showFirst"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MENull"));
        oper.setReturnClass(com.metacase.type.MENull.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[133] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("rowLabelsWidth");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[134] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setRowLabelsWidth");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rowLabelsWidth"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MENull"));
        oper.setReturnClass(com.metacase.type.MENull.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[135] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("textStyleSymbol");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[136] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setTextStyleSymbol");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "textStyleSymbol"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MENull"));
        oper.setReturnClass(com.metacase.type.MENull.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[137] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addNewAxisEltFor");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "addNewRepFor"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "toAxis"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "beforeIndex"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"));
        oper.setReturnClass(com.metacase.type.MEOop.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[138] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getWidth");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[139] = oper;

    }

    private static void _initOperationDesc15(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setWidth");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "setWidth"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MENull"));
        oper.setReturnClass(com.metacase.type.MENull.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[140] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("oT");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "METype"));
        oper.setReturnClass(com.metacase.type.METype.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[141] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("baseCollection");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEOopArray"));
        oper.setReturnClass(com.metacase.type.MEOop[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[142] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("font");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[143] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setFont");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "font"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MENull"));
        oper.setReturnClass(com.metacase.type.MENull.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[144] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("gxlWidths");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MEAnyArray"));
        oper.setReturnClass(com.metacase.type.MEAny[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[145] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setGxlWidths");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gxlWidths"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEAnyArray"), com.metacase.type.MEAny[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MENull"));
        oper.setReturnClass(com.metacase.type.MENull.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[146] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addNewTableEltFor");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "addNewRepFor"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MEOop"), com.metacase.type.MEOop.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "beforeIndex"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MENull"));
        oper.setReturnClass(com.metacase.type.MENull.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[147] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("currentDir");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MENull"), com.metacase.type.MENull.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "currentDir"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MENull"));
        oper.setReturnClass(com.metacase.type.MENull.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[148] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("fileInPatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MENull"), com.metacase.type.MENull.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fileInPatch"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MENull"));
        oper.setReturnClass(com.metacase.type.MENull.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[149] = oper;

    }

    private static void _initOperationDesc16(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("fileInPatches");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MENull"), com.metacase.type.MENull.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MENull"));
        oper.setReturnClass(com.metacase.type.MENull.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[150] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("abandon");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MENull"), com.metacase.type.MENull.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MENull"));
        oper.setReturnClass(com.metacase.type.MENull.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[151] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("backupToDB");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MENull"), com.metacase.type.MENull.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "backupToDB"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dir"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MENull"));
        oper.setReturnClass(com.metacase.type.MENull.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[152] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("commit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MENull"), com.metacase.type.MENull.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MENull"));
        oper.setReturnClass(com.metacase.type.MENull.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[153] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("condenseDatabase");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MENull"), com.metacase.type.MENull.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MENull"));
        oper.setReturnClass(com.metacase.type.MENull.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[154] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("condenseVersions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MENull"), com.metacase.type.MENull.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MENull"));
        oper.setReturnClass(com.metacase.type.MENull.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[155] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createProject");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MENull"), com.metacase.type.MENull.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "createProject"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MENull"));
        oper.setReturnClass(com.metacase.type.MENull.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[156] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("document");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MENull"), com.metacase.type.MENull.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "document"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "into"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MENull"));
        oper.setReturnClass(com.metacase.type.MENull.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[157] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("documentGraphsInto");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MENull"), com.metacase.type.MENull.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "documentGraphsInto"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MENull"));
        oper.setReturnClass(com.metacase.type.MENull.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[158] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("evalCode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MENull"), com.metacase.type.MENull.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "evalCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MENull"));
        oper.setReturnClass(com.metacase.type.MENull.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[159] = oper;

    }

    private static void _initOperationDesc17(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("exportName");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MENull"), com.metacase.type.MENull.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "exportName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "file"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MENull"));
        oper.setReturnClass(com.metacase.type.MENull.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[160] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("forAll");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MENull"), com.metacase.type.MENull.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "forAll"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "run"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MENull"));
        oper.setReturnClass(com.metacase.type.MENull.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[161] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("forName");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MENull"), com.metacase.type.MENull.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "forName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "run"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MENull"));
        oper.setReturnClass(com.metacase.type.MENull.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[162] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("login");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MENull"), com.metacase.type.MENull.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MENull"));
        oper.setReturnClass(com.metacase.type.MENull.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[163] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("loginDB");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MENull"), com.metacase.type.MENull.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "loginDB"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MENull"));
        oper.setReturnClass(com.metacase.type.MENull.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[164] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("loginNewDB");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MENull"), com.metacase.type.MENull.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "loginNewDB"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dir"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MENull"));
        oper.setReturnClass(com.metacase.type.MENull.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[165] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("logoutAndExit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MENull"), com.metacase.type.MENull.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MENull"));
        oper.setReturnClass(com.metacase.type.MENull.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[166] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("maintainDatabase");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MENull"), com.metacase.type.MENull.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MENull"));
        oper.setReturnClass(com.metacase.type.MENull.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[167] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("minimalUI");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MENull"), com.metacase.type.MENull.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MENull"));
        oper.setReturnClass(com.metacase.type.MENull.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[168] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obsolete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MENull"), com.metacase.type.MENull.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "obsolete"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MENull"));
        oper.setReturnClass(com.metacase.type.MENull.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[169] = oper;

    }

    private static void _initOperationDesc18(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("openAllProjects");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MENull"), com.metacase.type.MENull.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MENull"));
        oper.setReturnClass(com.metacase.type.MENull.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[170] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("quit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MENull"), com.metacase.type.MENull.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MENull"));
        oper.setReturnClass(com.metacase.type.MENull.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[171] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("resetVersionHistory");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MENull"), com.metacase.type.MENull.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MENull"));
        oper.setReturnClass(com.metacase.type.MENull.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[172] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("saveWSDL");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MENull"), com.metacase.type.MENull.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "saveWSDL"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MENull"));
        oper.setReturnClass(com.metacase.type.MENull.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[173] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setProject");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MENull"), com.metacase.type.MENull.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "setProject"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MENull"));
        oper.setReturnClass(com.metacase.type.MENull.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[174] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("startAPI");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MENull"), com.metacase.type.MENull.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MENull"));
        oper.setReturnClass(com.metacase.type.MENull.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[175] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("startAPIHostname");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MENull"), com.metacase.type.MENull.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "startAPIHostname"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "port"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "logEvents"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MENull"));
        oper.setReturnClass(com.metacase.type.MENull.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[176] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("stopAPI");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MENull"), com.metacase.type.MENull.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://metacase.com/type", "MENull"));
        oper.setReturnClass(com.metacase.type.MENull.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[177] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("commandLine");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MENull"), com.metacase.type.MENull.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[178] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("dbDir");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MENull"), com.metacase.type.MENull.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[179] = oper;

    }

    private static void _initOperationDesc19(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("dbName");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MENull"), com.metacase.type.MENull.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[180] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("defaultProject");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MENull"), com.metacase.type.MENull.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[181] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("exists");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MENull"), com.metacase.type.MENull.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "exists"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[182] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCurrentDir");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MENull"), com.metacase.type.MENull.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[183] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("textForMERL");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MENull"), com.metacase.type.MENull.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "textForMERL"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[184] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("unconvertedVersion");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MENull"), com.metacase.type.MENull.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[185] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("user");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MENull"), com.metacase.type.MENull.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[186] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("vcsComment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MENull"), com.metacase.type.MENull.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[187] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("vcsDirty");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MENull"), com.metacase.type.MENull.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[188] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("version");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MENull"), com.metacase.type.MENull.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[189] = oper;

    }

    private static void _initOperationDesc20(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("versionVerbose");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiver"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://metacase.com/type", "MENull"), com.metacase.type.MENull.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[190] = oper;

    }

    public MetaEditAPISoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public MetaEditAPISoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public MetaEditAPISoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://metacase.com/type", "MEAny");
            cachedSerQNames.add(qName);
            cls = com.metacase.type.MEAny.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://metacase.com/type", "MEAnyArray");
            cachedSerQNames.add(qName);
            cls = com.metacase.type.MEAny[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://metacase.com/type", "MEAny");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://metacase.com/type", "MENull");
            cachedSerQNames.add(qName);
            cls = com.metacase.type.MENull.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://metacase.com/type", "MEOop");
            cachedSerQNames.add(qName);
            cls = com.metacase.type.MEOop.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://metacase.com/type", "MEOopArray");
            cachedSerQNames.add(qName);
            cls = com.metacase.type.MEOop[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://metacase.com/type", "MEOop");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://metacase.com/type", "METype");
            cachedSerQNames.add(qName);
            cls = com.metacase.type.METype.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://metacase.com/type", "METypeArray");
            cachedSerQNames.add(qName);
            cls = com.metacase.type.METype[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://metacase.com/type", "METype");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
                    _call.setEncodingStyle(org.apache.axis.Constants.URI_SOAP11_ENC);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.metacase.type.MEOop[] allGoodInstances(com.metacase.type.METype receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.allGoodInstances");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "allGoodInstances"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEOop[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEOop[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEOop[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEOop[] allSimilarInstances(com.metacase.type.METype receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.allSimilarInstances");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "allSimilarInstances"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEOop[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEOop[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEOop[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.METype subTypeNamed(com.metacase.type.METype receiver, java.lang.String subTypeNamed) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.subTypeNamed");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "subTypeNamed"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, subTypeNamed});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.METype) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.METype) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.METype.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEOop[] findString(com.metacase.type.MEOop receiver, java.lang.String findString) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.findString");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "findString"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, findString});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEOop[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEOop[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEOop[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEOop[] instancesNamed(com.metacase.type.METype receiver, java.lang.String instancesNamed, java.lang.String ofSubTypesNamed) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.instancesNamed");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "instancesNamed"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, instancesNamed, ofSubTypesNamed});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEOop[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEOop[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEOop[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String typeName(com.metacase.type.METype receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.typeName");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "typeName"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.METype type(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.type");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "type"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.METype) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.METype) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.METype.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String typeTypeName(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.typeTypeName");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "typeTypeName"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String userPrintString(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.userPrintString");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "userPrintString"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEAny valueAt(com.metacase.type.MEOop receiver, int valueAt) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.valueAt");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "valueAt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, new java.lang.Integer(valueAt)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEAny) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEAny) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEAny.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEAny setValueAt(com.metacase.type.MEOop receiver, int valueAt, com.metacase.type.MEAny put) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.setValueAt");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "setValueAt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, new java.lang.Integer(valueAt), put});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEAny) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEAny) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEAny.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEAny[] allPropertiesValues(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.allPropertiesValues");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "allPropertiesValues"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEAny[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEAny[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEAny[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEOop[] allProperties(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.allProperties");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "allProperties"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEOop[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEOop[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEOop[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEAny[] allPropertiesWrapped(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.allPropertiesWrapped");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "allPropertiesWrapped"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEAny[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEAny[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEAny[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEAny instProps(com.metacase.type.METype receiver, com.metacase.type.MEAny[] propColl, com.metacase.type.MEAny[] valueColl, com.metacase.type.MEAny np, com.metacase.type.MEAny inArea) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.instProps");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "instProps"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, propColl, valueColl, np, inArea});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEAny) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEAny) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEAny.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEAny instPropsLocking(com.metacase.type.METype receiver, com.metacase.type.MEAny[] propCollLocking, com.metacase.type.MEAny[] valueColl, com.metacase.type.MEAny np, com.metacase.type.MEAny inArea) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.instPropsLocking");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "instPropsLocking"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, propCollLocking, valueColl, np, inArea});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEAny) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEAny) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEAny.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEOop unsafeNew(com.metacase.type.METype receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.unsafeNew");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "unsafeNew"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEOop) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEOop) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEOop.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEAny createGraphDialog(com.metacase.type.METype receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.createGraphDialog");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "createGraphDialog"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEAny) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEAny) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEAny.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEAny createFromPropertyDialogInArea(com.metacase.type.METype receiver, int createFromPropertyDialogInArea) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.createFromPropertyDialogInArea");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "createFromPropertyDialogInArea"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, new java.lang.Integer(createFromPropertyDialogInArea)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEAny) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEAny) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEAny.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean propertyDialog(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.propertyDialog");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "propertyDialog"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String allLocalNamesString(com.metacase.type.METype receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.allLocalNamesString");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "allLocalNamesString"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEAny propertyForLocalName(com.metacase.type.MEOop receiver, java.lang.String propertyForLocalName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.propertyForLocalName");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "propertyForLocalName"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, propertyForLocalName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEAny) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEAny) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEAny.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEAny valueForLocalName(com.metacase.type.MEOop receiver, java.lang.String valueForLocalName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.valueForLocalName");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "valueForLocalName"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, valueForLocalName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEAny) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEAny) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEAny.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEOop[] objectSet(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.objectSet");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "objectSet"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEOop[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEOop[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEOop[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEOop[] portSet(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.portSet");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "portSet"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEOop[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEOop[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEOop[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEOop[] relationshipSet(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.relationshipSet");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "relationshipSet"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEOop[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEOop[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEOop[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEOop[] roleSet(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.roleSet");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "roleSet"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEOop[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEOop[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEOop[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEOop[] bindingSet(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.bindingSet");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "bindingSet"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEOop[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEOop[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEOop[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEOop[] contentsMatchingType(com.metacase.type.MEOop receiver, com.metacase.type.METype contentsMatchingType, boolean allowSubTypes) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.contentsMatchingType");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "contentsMatchingType"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, contentsMatchingType, new java.lang.Boolean(allowSubTypes)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEOop[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEOop[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEOop[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEOop[] explodeGraphs(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.explodeGraphs");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "explodeGraphs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEOop[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEOop[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEOop[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEOop[] decompGraphs(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.decompGraphs");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "decompGraphs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEOop[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEOop[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEOop[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEOop[] subgraphs(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.subgraphs");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "subgraphs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEOop[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEOop[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEOop[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEOop addExplode(com.metacase.type.MEOop receiver, com.metacase.type.MEOop addExplode, com.metacase.type.MEOop _for) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.addExplode");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "addExplode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, addExplode, _for});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEOop) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEOop) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEOop.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEOop[] getExplodeGraphsForNP(com.metacase.type.MEOop receiver, com.metacase.type.MEOop getExplodeGraphsForNP) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.getExplodeGraphsForNP");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "getExplodeGraphsForNP"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, getExplodeGraphsForNP});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEOop[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEOop[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEOop[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEOop removeExplode(com.metacase.type.MEOop receiver, com.metacase.type.MEOop removeExplode, com.metacase.type.MEOop _for) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.removeExplode");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "removeExplode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, removeExplode, _for});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEOop) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEOop) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEOop.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEAny decompGraph(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.decompGraph");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "decompGraph"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEAny) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEAny) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEAny.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEAny setDecompGraph(com.metacase.type.MEOop receiver, com.metacase.type.MEAny decompGraph) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.setDecompGraph");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "setDecompGraph"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, decompGraph});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEAny) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEAny) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEAny.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEOop[] objsForObj(com.metacase.type.MEOop receiver, com.metacase.type.MEOop objsForObj, com.metacase.type.METype ofClass) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.objsForObj");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "objsForObj"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, objsForObj, ofClass});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEOop[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEOop[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEOop[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEOop[] objsForPort(com.metacase.type.MEOop receiver, com.metacase.type.MEOop objsForPort, com.metacase.type.METype ofClass) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.objsForPort");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "objsForPort"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, objsForPort, ofClass});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEOop[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEOop[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEOop[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEOop[] objsForRel(com.metacase.type.MEOop receiver, com.metacase.type.MEOop objsForRel, com.metacase.type.METype ofClass) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.objsForRel");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "objsForRel"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, objsForRel, ofClass});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEOop[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEOop[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEOop[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEOop[] objsForRole(com.metacase.type.MEOop receiver, com.metacase.type.MEOop objsForRole, com.metacase.type.METype ofClass) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.objsForRole");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "objsForRole"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, objsForRole, ofClass});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEOop[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEOop[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEOop[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEOop[] portsForObj(com.metacase.type.MEOop receiver, com.metacase.type.MEOop portsForObj, com.metacase.type.METype ofClass) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.portsForObj");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "portsForObj"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, portsForObj, ofClass});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEOop[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEOop[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEOop[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEOop[] portsForPort(com.metacase.type.MEOop receiver, com.metacase.type.MEOop portsForPort, com.metacase.type.METype ofClass) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.portsForPort");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "portsForPort"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, portsForPort, ofClass});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEOop[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEOop[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEOop[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEOop[] portsForRel(com.metacase.type.MEOop receiver, com.metacase.type.MEOop portsForRel, com.metacase.type.METype ofClass) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.portsForRel");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "portsForRel"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, portsForRel, ofClass});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEOop[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEOop[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEOop[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEOop[] portsForRole(com.metacase.type.MEOop receiver, com.metacase.type.MEOop portsForRole, com.metacase.type.METype ofClass) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.portsForRole");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "portsForRole"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, portsForRole, ofClass});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEOop[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEOop[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEOop[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEOop[] relsForObj(com.metacase.type.MEOop receiver, com.metacase.type.MEOop relsForObj, com.metacase.type.METype ofClass) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.relsForObj");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "relsForObj"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, relsForObj, ofClass});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEOop[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEOop[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEOop[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEOop[] relsForPort(com.metacase.type.MEOop receiver, com.metacase.type.MEOop relsForPort, com.metacase.type.METype ofClass) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.relsForPort");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "relsForPort"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, relsForPort, ofClass});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEOop[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEOop[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEOop[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEOop[] relsForRel(com.metacase.type.MEOop receiver, com.metacase.type.MEOop relsForRel, com.metacase.type.METype ofClass) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.relsForRel");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "relsForRel"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, relsForRel, ofClass});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEOop[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEOop[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEOop[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEOop[] relsForRole(com.metacase.type.MEOop receiver, com.metacase.type.MEOop relsForRole, com.metacase.type.METype ofClass) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.relsForRole");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "relsForRole"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, relsForRole, ofClass});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEOop[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEOop[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEOop[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEOop[] rolesForObj(com.metacase.type.MEOop receiver, com.metacase.type.MEOop rolesForObj, com.metacase.type.METype ofClass) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[49]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.rolesForObj");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "rolesForObj"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, rolesForObj, ofClass});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEOop[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEOop[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEOop[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEOop[] rolesForPort(com.metacase.type.MEOop receiver, com.metacase.type.MEOop rolesForPort, com.metacase.type.METype ofClass) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[50]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.rolesForPort");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "rolesForPort"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, rolesForPort, ofClass});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEOop[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEOop[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEOop[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEOop[] rolesForRel(com.metacase.type.MEOop receiver, com.metacase.type.MEOop rolesForRel, com.metacase.type.METype ofClass) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[51]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.rolesForRel");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "rolesForRel"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, rolesForRel, ofClass});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEOop[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEOop[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEOop[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEOop[] rolesForRole(com.metacase.type.MEOop receiver, com.metacase.type.MEOop rolesForRole, com.metacase.type.METype ofClass) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[52]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.rolesForRole");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "rolesForRole"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, rolesForRole, ofClass});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEOop[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEOop[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEOop[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean forGraphRun(com.metacase.type.MEOop receiver, java.lang.String forGraphRun) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[53]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.forGraphRun");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "forGraphRun"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, forGraphRun});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String textForGraphRun(com.metacase.type.MEOop receiver, java.lang.String textForGraphRun, java.lang.String preRun) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[54]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.textForGraphRun");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "textForGraphRun"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, textForGraphRun, preRun});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String textForRun(com.metacase.type.MENull receiver, java.lang.String textForRun, com.metacase.type.MEAny[] stack, com.metacase.type.MEAny[] arguments, java.lang.String preRun) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[55]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.textForRun");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "textForRun"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, textForRun, stack, arguments, preRun});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String generatorNames(com.metacase.type.METype receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[56]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.generatorNames");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "generatorNames"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MENull open(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[57]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.open");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "open"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MENull) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MENull) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MENull.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MENull animate(com.metacase.type.MEOop receiver, com.metacase.type.MEOop animate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[58]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.animate");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "animate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, animate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MENull) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MENull) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MENull.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MENull animateAll(com.metacase.type.MEOop receiver, com.metacase.type.MEOop[] animateAll) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[59]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.animateAll");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "animateAll"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, animateAll});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MENull) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MENull) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MENull.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MENull animateNone(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[60]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.animateNone");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "animateNone"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MENull) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MENull) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MENull.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MENull refresh(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[61]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.refresh");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "refresh"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MENull) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MENull) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MENull.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean isDirty(com.metacase.type.MENull receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[62]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.isDirty");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "isDirty"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean isLogout(com.metacase.type.MENull receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[63]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.isLogout");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "isLogout"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEOop[] copiedObjects(com.metacase.type.MENull receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[64]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.copiedObjects");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "copiedObjects"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEOop[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEOop[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEOop[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEAny[] waitForBindingCreation(com.metacase.type.MENull receiver, int waitForBindingCreation) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[65]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.waitForBindingCreation");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "waitForBindingCreation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, new java.lang.Integer(waitForBindingCreation)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEAny[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEAny[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEAny[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEAny[] waitForBindingFinalization(com.metacase.type.MENull receiver, int waitForBindingFinalization, com.metacase.type.MEOop in) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[66]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.waitForBindingFinalization");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "waitForBindingFinalization"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, new java.lang.Integer(waitForBindingFinalization), in});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEAny[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEAny[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEAny[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEOop[] openedGraphReprs(com.metacase.type.MENull receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[67]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.openedGraphReprs");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "openedGraphReprs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEOop[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEOop[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEOop[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean startMemento(com.metacase.type.MENull receiver, java.lang.String startMemento) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[68]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.startMemento");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "startMemento"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, startMemento});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean stopMemento(com.metacase.type.MENull receiver, java.lang.String stopMemento) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[69]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.stopMemento");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "stopMemento"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, stopMemento});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String lockAll(com.metacase.type.MENull receiver, com.metacase.type.MEOop[] lockAll) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[70]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.lockAll");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "lockAll"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, lockAll});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MENull delete(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[71]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.delete");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "delete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MENull) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MENull) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MENull.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MENull addToGraph(com.metacase.type.MEOop receiver, com.metacase.type.MEOop addToGraph) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[72]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.addToGraph");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "addToGraph"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, addToGraph});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MENull) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MENull) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MENull.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEOop createBinding(com.metacase.type.MEOop receiver, com.metacase.type.METype relType, com.metacase.type.METype[] roleTypes, com.metacase.type.MEOop[] objects) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[73]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.createBinding");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "createBinding"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, relType, roleTypes, objects});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEOop) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEOop) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEOop.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEOop createBindingWithPorts(com.metacase.type.MEOop receiver, com.metacase.type.METype relType, com.metacase.type.METype[] roleTypes, com.metacase.type.MEAny[] ports, com.metacase.type.MEOop[] objects) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[74]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.createBindingWithPorts");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "createBindingWithPorts"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, relType, roleTypes, ports, objects});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEOop) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEOop) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEOop.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean removeBinding(com.metacase.type.MEOop receiver, com.metacase.type.MEOop removeBinding) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[75]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.removeBinding");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "removeBinding"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, removeBinding});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEOop relationship(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[76]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.relationship");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "relationship"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEOop) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEOop) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEOop.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEOop[] roles(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[77]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.roles");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "roles"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEOop[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEOop[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEOop[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEAny[] portSlots(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[78]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.portSlots");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "portSlots"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEAny[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEAny[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEAny[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEOop[] objects(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[79]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.objects");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "objects"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEOop[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEOop[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEOop[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEAny[] connectionIds(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[80]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.connectionIds");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "connectionIds"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEAny[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEAny[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEAny[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEOop[] diagrams(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[81]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.diagrams");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "diagrams"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEOop[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEOop[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEOop[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEOop[] matrices(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[82]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.matrices");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "matrices"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEOop[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEOop[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEOop[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEOop[] tables(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[83]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.tables");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "tables"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEOop[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEOop[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEOop[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEOop newDiagram(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[84]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.newDiagram");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "newDiagram"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEOop) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEOop) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEOop.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEOop newMatrix(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[85]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.newMatrix");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "newMatrix"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEOop) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEOop) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEOop.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEOop newTable(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[86]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.newTable");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "newTable"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEOop) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEOop) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEOop.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEOop inst(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[87]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.inst");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "inst"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEOop) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEOop) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEOop.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEOop[] repSet(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[88]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.repSet");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "repSet"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEOop[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEOop[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEOop[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEOop reprGraph(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[89]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.reprGraph");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "reprGraph"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEOop) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEOop) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEOop.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEOop remove(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[90]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.remove");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "remove"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEOop) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEOop) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEOop.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.util.Calendar timeStamp(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[91]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.timeStamp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "timeStamp"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.util.Calendar) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.util.Calendar) org.apache.axis.utils.JavaUtils.convert(_resp, java.util.Calendar.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MENull setTimeStamp(com.metacase.type.MEOop receiver, java.util.Calendar timeStamp) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[92]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.setTimeStamp");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "setTimeStamp"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, timeStamp});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MENull) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MENull) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MENull.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEOop[] objectReprs(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[93]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.objectReprs");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "objectReprs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEOop[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEOop[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEOop[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEOop[] bindingReprs(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[94]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.bindingReprs");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "bindingReprs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEOop[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEOop[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEOop[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEAny grid(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[95]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.grid");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "grid"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEAny) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEAny) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEAny.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MENull setGrid(com.metacase.type.MEOop receiver, com.metacase.type.MEAny grid) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[96]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.setGrid");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "setGrid"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, grid});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MENull) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MENull) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MENull.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean displayGrid(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[97]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.displayGrid");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "displayGrid"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MENull setDisplayGrid(com.metacase.type.MEOop receiver, boolean displayGrid) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[98]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.setDisplayGrid");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "setDisplayGrid"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, new java.lang.Boolean(displayGrid)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MENull) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MENull) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MENull.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean useGrid(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[99]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.useGrid");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "useGrid"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MENull setUseGrid(com.metacase.type.MEOop receiver, boolean useGrid) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[100]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.setUseGrid");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "setUseGrid"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, new java.lang.Boolean(useGrid)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MENull) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MENull) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MENull.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEAny place(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[101]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.place");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "place"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEAny) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEAny) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEAny.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MENull setPlace(com.metacase.type.MEOop receiver, com.metacase.type.MEAny place) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[102]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.setPlace");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "setPlace"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, place});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MENull) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MENull) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MENull.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEAny scale(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[103]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.scale");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "scale"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEAny) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEAny) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEAny.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MENull setScale(com.metacase.type.MEOop receiver, com.metacase.type.MEAny scale) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[104]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.setScale");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "setScale"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, scale});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MENull) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MENull) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MENull.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean isStraight(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[105]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.isStraight");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "isStraight"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MENull setIsStraight(com.metacase.type.MEOop receiver, boolean isStraight) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[106]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.setIsStraight");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "setIsStraight"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, new java.lang.Boolean(isStraight)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MENull) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MENull) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MENull.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MENull straighten(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[107]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.straighten");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "straighten"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MENull) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MENull) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MENull.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MENull layout(com.metacase.type.MEOop receiver, com.metacase.type.METype layoutRelationship, com.metacase.type.METype fromRole, com.metacase.type.METype toRole, java.lang.String direction, boolean manhattan) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[108]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.layout");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "layout"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, layoutRelationship, fromRole, toRole, direction, new java.lang.Boolean(manhattan)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MENull) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MENull) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MENull.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEOop addNewObjectRepFor(com.metacase.type.MEOop receiver, com.metacase.type.MEOop addNewObjectRepFor, int beforeIndex, com.metacase.type.MEAny place) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[109]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.addNewObjectRepFor");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "addNewObjectRepFor"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, addNewObjectRepFor, new java.lang.Integer(beforeIndex), place});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEOop) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEOop) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEOop.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEOop addNewBindingRepFor(com.metacase.type.MEOop receiver, com.metacase.type.MEOop addNewBindingRepFor, int beforeIndex, com.metacase.type.MEAny place) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[110]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.addNewBindingRepFor");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "addNewBindingRepFor"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, addNewBindingRepFor, new java.lang.Integer(beforeIndex), place});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEOop) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEOop) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEOop.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEAny[] connectionReprIds(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[111]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.connectionReprIds");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "connectionReprIds"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEAny[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEAny[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEAny[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEAny[] breakpoints(com.metacase.type.MEOop receiver, int breakpointsWithId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[112]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.breakpoints");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "breakpoints"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, new java.lang.Integer(breakpointsWithId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEAny[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEAny[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEAny[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MENull setBreakpoints(com.metacase.type.MEOop receiver, com.metacase.type.MEAny[] setBreakpoints, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[113]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.setBreakpoints");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "setBreakpoints"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, setBreakpoints, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MENull) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MENull) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MENull.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MENull addPoint(com.metacase.type.MEOop receiver, com.metacase.type.MEAny addPoint, int index, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[114]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.addPoint");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "addPoint"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, addPoint, new java.lang.Integer(index), new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MENull) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MENull) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MENull.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MENull putPointAtIndex(com.metacase.type.MEOop receiver, int at, com.metacase.type.MEAny putPoint, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[115]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.putPointAtIndex");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "putPointAtIndex"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, new java.lang.Integer(at), putPoint, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MENull) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MENull) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MENull.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEAny removePoint(com.metacase.type.MEOop receiver, com.metacase.type.MEAny removePoint, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[116]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.removePoint");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "removePoint"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, removePoint, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEAny) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEAny) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEAny.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEAny objTargetOffset(com.metacase.type.MEOop receiver, int objTargetOffsetWithId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[117]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.objTargetOffset");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "objTargetOffset"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, new java.lang.Integer(objTargetOffsetWithId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEAny) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEAny) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEAny.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MENull setObjTargetOffset(com.metacase.type.MEOop receiver, com.metacase.type.MEAny objTargetOffset, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[118]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.setObjTargetOffset");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "setObjTargetOffset"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, objTargetOffset, new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MENull) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MENull) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MENull.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean isMovable(com.metacase.type.MEOop receiver, int isMovableWithId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[119]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.isMovable");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "isMovable"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, new java.lang.Integer(isMovableWithId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MENull setIsMovable(com.metacase.type.MEOop receiver, boolean isMovable, int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[120]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.setIsMovable");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "setIsMovable"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, new java.lang.Boolean(isMovable), new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MENull) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MENull) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MENull.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MENull importGraph(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[121]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.importGraph");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "importGraph"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MENull) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MENull) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MENull.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEOop[] hAxis(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[122]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.hAxis");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "hAxis"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEOop[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEOop[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEOop[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEOop[] vAxis(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[123]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.vAxis");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "vAxis"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEOop[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEOop[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEOop[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String bindSelect(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[124]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.bindSelect");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "bindSelect"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MENull setBindSelect(com.metacase.type.MEOop receiver, java.lang.String bindSelect) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[125]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.setBindSelect");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "setBindSelect"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, bindSelect});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MENull) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MENull) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MENull.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String cellDisplayMode(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[126]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.cellDisplayMode");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "cellDisplayMode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MENull setCellDisplayMode(com.metacase.type.MEOop receiver, java.lang.String cellDisplayMode) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[127]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.setCellDisplayMode");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "setCellDisplayMode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, cellDisplayMode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MENull) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MENull) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MENull.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String displayStringSelector(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[128]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.displayStringSelector");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "displayStringSelector"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MENull setDisplayStringSelector(com.metacase.type.MEOop receiver, java.lang.String displayStringSelector) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[129]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.setDisplayStringSelector");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "setDisplayStringSelector"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, displayStringSelector});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MENull) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MENull) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MENull.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String axisDisplayMode(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[130]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.axisDisplayMode");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "axisDisplayMode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MENull setAxisDisplayMode(com.metacase.type.MEOop receiver, java.lang.String axisDisplayMode) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[131]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.setAxisDisplayMode");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "setAxisDisplayMode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, axisDisplayMode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MENull) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MENull) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MENull.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean showFirst(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[132]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.showFirst");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "showFirst"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MENull setShowFirst(com.metacase.type.MEOop receiver, boolean showFirst) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[133]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.setShowFirst");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "setShowFirst"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, new java.lang.Boolean(showFirst)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MENull) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MENull) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MENull.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int rowLabelsWidth(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[134]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.rowLabelsWidth");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "rowLabelsWidth"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MENull setRowLabelsWidth(com.metacase.type.MEOop receiver, int rowLabelsWidth) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[135]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.setRowLabelsWidth");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "setRowLabelsWidth"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, new java.lang.Integer(rowLabelsWidth)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MENull) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MENull) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MENull.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String textStyleSymbol(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[136]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.textStyleSymbol");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "textStyleSymbol"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MENull setTextStyleSymbol(com.metacase.type.MEOop receiver, java.lang.String textStyleSymbol) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[137]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.setTextStyleSymbol");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "setTextStyleSymbol"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, textStyleSymbol});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MENull) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MENull) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MENull.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEOop addNewAxisEltFor(com.metacase.type.MEOop receiver, com.metacase.type.MEOop addNewRepFor, java.lang.String toAxis, int beforeIndex) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[138]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.addNewAxisEltFor");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "addNewAxisEltFor"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, addNewRepFor, toAxis, new java.lang.Integer(beforeIndex)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEOop) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEOop) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEOop.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int getWidth(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[139]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.getWidth");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "getWidth"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MENull setWidth(com.metacase.type.MEOop receiver, int setWidth) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[140]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.setWidth");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "setWidth"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, new java.lang.Integer(setWidth)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MENull) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MENull) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MENull.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.METype oT(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[141]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.oT");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "oT"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.METype) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.METype) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.METype.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEOop[] baseCollection(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[142]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.baseCollection");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "baseCollection"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEOop[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEOop[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEOop[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String font(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[143]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.font");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "font"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MENull setFont(com.metacase.type.MEOop receiver, java.lang.String font) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[144]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.setFont");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "setFont"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, font});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MENull) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MENull) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MENull.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MEAny[] gxlWidths(com.metacase.type.MEOop receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[145]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.gxlWidths");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "gxlWidths"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MEAny[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MEAny[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MEAny[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MENull setGxlWidths(com.metacase.type.MEOop receiver, com.metacase.type.MEAny[] gxlWidths) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[146]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.setGxlWidths");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "setGxlWidths"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, gxlWidths});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MENull) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MENull) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MENull.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MENull addNewTableEltFor(com.metacase.type.MEOop receiver, com.metacase.type.MEOop addNewRepFor, int beforeIndex) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[147]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.addNewTableEltFor");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "addNewTableEltFor"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, addNewRepFor, new java.lang.Integer(beforeIndex)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MENull) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MENull) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MENull.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MENull currentDir(com.metacase.type.MENull receiver, java.lang.String currentDir) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[148]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.currentDir");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "currentDir"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, currentDir});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MENull) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MENull) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MENull.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MENull fileInPatch(com.metacase.type.MENull receiver, java.lang.String fileInPatch) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[149]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.fileInPatch");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "fileInPatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, fileInPatch});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MENull) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MENull) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MENull.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MENull fileInPatches(com.metacase.type.MENull receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[150]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.fileInPatches");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "fileInPatches"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MENull) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MENull) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MENull.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MENull abandon(com.metacase.type.MENull receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[151]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.abandon");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "abandon"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MENull) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MENull) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MENull.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MENull backupToDB(com.metacase.type.MENull receiver, java.lang.String backupToDB, java.lang.String dir) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[152]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.backupToDB");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "backupToDB"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, backupToDB, dir});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MENull) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MENull) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MENull.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MENull commit(com.metacase.type.MENull receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[153]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.commit");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "commit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MENull) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MENull) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MENull.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MENull condenseDatabase(com.metacase.type.MENull receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[154]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.condenseDatabase");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "condenseDatabase"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MENull) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MENull) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MENull.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MENull condenseVersions(com.metacase.type.MENull receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[155]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.condenseVersions");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "condenseVersions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MENull) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MENull) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MENull.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MENull createProject(com.metacase.type.MENull receiver, java.lang.String createProject) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[156]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.createProject");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "createProject"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, createProject});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MENull) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MENull) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MENull.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MENull document(com.metacase.type.MENull receiver, java.lang.String document, java.lang.String into) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[157]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.document");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "document"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, document, into});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MENull) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MENull) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MENull.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MENull documentGraphsInto(com.metacase.type.MENull receiver, java.lang.String documentGraphsInto) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[158]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.documentGraphsInto");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "documentGraphsInto"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, documentGraphsInto});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MENull) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MENull) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MENull.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MENull evalCode(com.metacase.type.MENull receiver, java.lang.String evalCode) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[159]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.evalCode");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "evalCode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, evalCode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MENull) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MENull) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MENull.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MENull exportName(com.metacase.type.MENull receiver, java.lang.String exportName, java.lang.String type, java.lang.String file) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[160]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.exportName");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "exportName"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, exportName, type, file});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MENull) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MENull) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MENull.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MENull forAll(com.metacase.type.MENull receiver, java.lang.String forAll, java.lang.String run) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[161]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.forAll");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "forAll"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, forAll, run});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MENull) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MENull) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MENull.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MENull forName(com.metacase.type.MENull receiver, java.lang.String forName, java.lang.String type, java.lang.String run) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[162]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.forName");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "forName"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, forName, type, run});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MENull) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MENull) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MENull.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MENull login(com.metacase.type.MENull receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[163]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.login");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "login"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MENull) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MENull) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MENull.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MENull loginDB(com.metacase.type.MENull receiver, java.lang.String loginDB, java.lang.String user, java.lang.String password) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[164]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.loginDB");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "loginDB"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, loginDB, user, password});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MENull) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MENull) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MENull.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MENull loginNewDB(com.metacase.type.MENull receiver, java.lang.String loginNewDB, java.lang.String dir, java.lang.String user, java.lang.String password) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[165]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.loginNewDB");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "loginNewDB"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, loginNewDB, dir, user, password});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MENull) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MENull) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MENull.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MENull logoutAndExit(com.metacase.type.MENull receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[166]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.logoutAndExit");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "logoutAndExit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MENull) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MENull) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MENull.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MENull maintainDatabase(com.metacase.type.MENull receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[167]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.maintainDatabase");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "maintainDatabase"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MENull) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MENull) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MENull.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MENull minimalUI(com.metacase.type.MENull receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[168]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.minimalUI");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "minimalUI"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MENull) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MENull) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MENull.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MENull obsolete(com.metacase.type.MENull receiver, java.lang.String obsolete) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[169]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.obsolete");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "obsolete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, obsolete});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MENull) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MENull) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MENull.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MENull openAllProjects(com.metacase.type.MENull receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[170]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.openAllProjects");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "openAllProjects"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MENull) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MENull) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MENull.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MENull quit(com.metacase.type.MENull receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[171]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.quit");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "quit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MENull) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MENull) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MENull.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MENull resetVersionHistory(com.metacase.type.MENull receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[172]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.resetVersionHistory");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "resetVersionHistory"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MENull) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MENull) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MENull.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MENull saveWSDL(com.metacase.type.MENull receiver, java.lang.String saveWSDL) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[173]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.saveWSDL");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "saveWSDL"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, saveWSDL});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MENull) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MENull) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MENull.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MENull setProject(com.metacase.type.MENull receiver, java.lang.String setProject) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[174]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.setProject");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "setProject"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, setProject});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MENull) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MENull) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MENull.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MENull startAPI(com.metacase.type.MENull receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[175]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.startAPI");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "startAPI"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MENull) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MENull) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MENull.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MENull startAPIHostname(com.metacase.type.MENull receiver, java.lang.String startAPIHostname, java.lang.String port, java.lang.String logEvents) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[176]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.startAPIHostname");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "startAPIHostname"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, startAPIHostname, port, logEvents});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MENull) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MENull) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MENull.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.metacase.type.MENull stopAPI(com.metacase.type.MENull receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[177]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.stopAPI");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "stopAPI"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.metacase.type.MENull) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.metacase.type.MENull) org.apache.axis.utils.JavaUtils.convert(_resp, com.metacase.type.MENull.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String commandLine(com.metacase.type.MENull receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[178]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.commandLine");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "commandLine"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String dbDir(com.metacase.type.MENull receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[179]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.dbDir");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "dbDir"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String dbName(com.metacase.type.MENull receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[180]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.dbName");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "dbName"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String defaultProject(com.metacase.type.MENull receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[181]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.defaultProject");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "defaultProject"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String exists(com.metacase.type.MENull receiver, java.lang.String exists) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[182]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.exists");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "exists"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, exists});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String getCurrentDir(com.metacase.type.MENull receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[183]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.getCurrentDir");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "getCurrentDir"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String textForMERL(com.metacase.type.MENull receiver, java.lang.String textForMERL) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[184]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.textForMERL");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "textForMERL"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver, textForMERL});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String unconvertedVersion(com.metacase.type.MENull receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[185]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.unconvertedVersion");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "unconvertedVersion"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String user(com.metacase.type.MENull receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[186]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.user");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "user"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String vcsComment(com.metacase.type.MENull receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[187]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.vcsComment");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "vcsComment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String vcsDirty(com.metacase.type.MENull receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[188]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.vcsDirty");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "vcsDirty"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String version(com.metacase.type.MENull receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[189]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.version");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "version"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String versionVerbose(com.metacase.type.MENull receiver) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[190]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://metacase.com/MetaEditAPI.versionVerbose");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://metacase.com/wsdl/", "versionVerbose"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {receiver});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
