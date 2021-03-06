/*
 * An XML document type.
 * Localname: ArrayOfAppointmentProposal
 * Namespace: http://schemas.microsoft.com/crm/2011/Contracts
 * Java type: com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposalDocument
 *
 * Automatically generated - do not modify.
 */
package com.microsoft.schemas.crm._2011.contracts;


/**
 * A document containing one ArrayOfAppointmentProposal(@http://schemas.microsoft.com/crm/2011/Contracts) element.
 *
 * This is a complex type.
 */
public interface ArrayOfAppointmentProposalDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ArrayOfAppointmentProposalDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s89F572913020FF22DE00DBDBAAFD31DF").resolveHandle("arrayofappointmentproposalc457doctype");
    
    /**
     * Gets the "ArrayOfAppointmentProposal" element
     */
    com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposal getArrayOfAppointmentProposal();
    
    /**
     * Tests for nil "ArrayOfAppointmentProposal" element
     */
    boolean isNilArrayOfAppointmentProposal();
    
    /**
     * Sets the "ArrayOfAppointmentProposal" element
     */
    void setArrayOfAppointmentProposal(com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposal arrayOfAppointmentProposal);
    
    /**
     * Appends and returns a new empty "ArrayOfAppointmentProposal" element
     */
    com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposal addNewArrayOfAppointmentProposal();
    
    /**
     * Nils the "ArrayOfAppointmentProposal" element
     */
    void setNilArrayOfAppointmentProposal();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposalDocument newInstance() {
          return (com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposalDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposalDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposalDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposalDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposalDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposalDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposalDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposalDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposalDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposalDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposalDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposalDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposalDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposalDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposalDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposalDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposalDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.microsoft.schemas.crm._2011.contracts.ArrayOfAppointmentProposalDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
