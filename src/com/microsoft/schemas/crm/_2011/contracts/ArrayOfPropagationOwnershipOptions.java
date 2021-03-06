/*
 * XML Type:  ArrayOfPropagationOwnershipOptions
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptions
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts;


/**
 * An XML ArrayOfPropagationOwnershipOptions(@http://schemas.microsoft.com/crm/2011/Contracts).
 *
 * This is a complex type.
 */
public interface ArrayOfPropagationOwnershipOptions extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ArrayOfPropagationOwnershipOptions.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s89F572913020FF22DE00DBDBAAFD31DF").resolveHandle("arrayofpropagationownershipoptions6bb1type");
    
    /**
     * Gets array of all "PropagationOwnershipOptions" elements
     */
    com.microsoft.schemas.crm._2011.contracts.PropagationOwnershipOptions.Enum[] getPropagationOwnershipOptionsArray();
    
    /**
     * Gets ith "PropagationOwnershipOptions" element
     */
    com.microsoft.schemas.crm._2011.contracts.PropagationOwnershipOptions.Enum getPropagationOwnershipOptionsArray(int i);
    
    /**
     * Gets (as xml) array of all "PropagationOwnershipOptions" elements
     */
    com.microsoft.schemas.crm._2011.contracts.PropagationOwnershipOptions[] xgetPropagationOwnershipOptionsArray();
    
    /**
     * Gets (as xml) ith "PropagationOwnershipOptions" element
     */
    com.microsoft.schemas.crm._2011.contracts.PropagationOwnershipOptions xgetPropagationOwnershipOptionsArray(int i);
    
    /**
     * Returns number of "PropagationOwnershipOptions" element
     */
    int sizeOfPropagationOwnershipOptionsArray();
    
    /**
     * Sets array of all "PropagationOwnershipOptions" element
     */
    void setPropagationOwnershipOptionsArray(com.microsoft.schemas.crm._2011.contracts.PropagationOwnershipOptions.Enum[] propagationOwnershipOptionsArray);
    
    /**
     * Sets ith "PropagationOwnershipOptions" element
     */
    void setPropagationOwnershipOptionsArray(int i, com.microsoft.schemas.crm._2011.contracts.PropagationOwnershipOptions.Enum propagationOwnershipOptions);
    
    /**
     * Sets (as xml) array of all "PropagationOwnershipOptions" element
     */
    void xsetPropagationOwnershipOptionsArray(com.microsoft.schemas.crm._2011.contracts.PropagationOwnershipOptions[] propagationOwnershipOptionsArray);
    
    /**
     * Sets (as xml) ith "PropagationOwnershipOptions" element
     */
    void xsetPropagationOwnershipOptionsArray(int i, com.microsoft.schemas.crm._2011.contracts.PropagationOwnershipOptions propagationOwnershipOptions);
    
    /**
     * Inserts the value as the ith "PropagationOwnershipOptions" element
     */
    void insertPropagationOwnershipOptions(int i, com.microsoft.schemas.crm._2011.contracts.PropagationOwnershipOptions.Enum propagationOwnershipOptions);
    
    /**
     * Appends the value as the last "PropagationOwnershipOptions" element
     */
    void addPropagationOwnershipOptions(com.microsoft.schemas.crm._2011.contracts.PropagationOwnershipOptions.Enum propagationOwnershipOptions);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "PropagationOwnershipOptions" element
     */
    com.microsoft.schemas.crm._2011.contracts.PropagationOwnershipOptions insertNewPropagationOwnershipOptions(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "PropagationOwnershipOptions" element
     */
    com.microsoft.schemas.crm._2011.contracts.PropagationOwnershipOptions addNewPropagationOwnershipOptions();
    
    /**
     * Removes the ith "PropagationOwnershipOptions" element
     */
    void removePropagationOwnershipOptions(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptions newInstance() {
          return (com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptions newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptions parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptions parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptions parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptions parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptions parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptions parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptions parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptions parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptions parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptions parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptions parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptions parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptions parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptions parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptions parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptions parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2011.contracts.ArrayOfPropagationOwnershipOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
