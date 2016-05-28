// =====================================================================
//  This file is part of the Microsoft Dynamics CRM SDK code samples.
//
//  Copyright (C) Microsoft Corporation.  All rights reserved.
//
//  This source code is intended only as a supplement to Microsoft
//  Development Tools and/or on-line documentation.  See these other
//  materials for detailed information regarding Microsoft code samples.
//
//  THIS CODE AND INFORMATION ARE PROVIDED "AS IS" WITHOUT WARRANTY OF ANY
//  KIND, EITHER EXPRESSED OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
//  IMPLIED WARRANTIES OF MERCHANTABILITY AND/OR FITNESS FOR A
//  PARTICULAR PURPOSE.
// =====================================================================

package java2crmpack;

import java.rmi.RemoteException;
import java.util.Scanner;
import java.util.UUID;

import javax.xml.stream.XMLStreamException;

import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axiom.om.OMNamespace;
import org.apache.axiom.om.OMText;
import org.apache.axiom.om.util.AXIOMUtil;
import org.apache.axiom.soap.SOAPHeaderBlock;
import org.apache.axis2.AxisFault;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;
import org.apache.axis2.context.ConfigurationContext;
import org.apache.axis2.context.ConfigurationContextFactory;
import org.apache.log4j.Logger;
import org.apache.xmlbeans.FilterXmlObject;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlString;
import org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfEndpointTypestringztYlk6OT;
import org.datacontract.schemas._2004._07.system_collections_generic.KeyValuePairOfstringanyType;

import com.microsoft.schemas._2003._10.serialization.Guid;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import com.microsoft.schemas.xrm._2011.contracts.AttributeCollection;
import com.microsoft.schemas.xrm._2011.contracts.ColumnSet;
import com.microsoft.schemas.xrm._2011.contracts.Entity;
import com.microsoft.schemas.xrm._2011.contracts.discovery.DiscoveryResponse;
import com.microsoft.schemas.xrm._2011.contracts.discovery.EndpointType;
import com.microsoft.schemas.xrm._2011.contracts.discovery.ExecuteDocument;
import com.microsoft.schemas.xrm._2011.contracts.discovery.ExecuteDocument.Execute;
import com.microsoft.schemas.xrm._2011.contracts.discovery.ExecuteResponseDocument;
import com.microsoft.schemas.xrm._2011.contracts.discovery.ExecuteResponseDocument.ExecuteResponse;
import com.microsoft.schemas.xrm._2011.contracts.discovery.OrganizationDetail;
import com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationRequest;
import com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationRequestDocument;
import com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationResponse;
import com.microsoft.schemas.xrm._2011.contracts.discovery.RetrieveOrganizationResponseDocument;
import com.microsoft.schemas.xrm._2011.contracts.services.CreateDocument;
import com.microsoft.schemas.xrm._2011.contracts.services.CreateDocument.Create;
import com.microsoft.schemas.xrm._2011.contracts.services.CreateResponseDocument;
import com.microsoft.schemas.xrm._2011.contracts.services.DeleteDocument;
import com.microsoft.schemas.xrm._2011.contracts.services.DeleteDocument.Delete;
import com.microsoft.schemas.xrm._2011.contracts.services.RetrieveDocument;
import com.microsoft.schemas.xrm._2011.contracts.services.RetrieveDocument.Retrieve;
import com.microsoft.schemas.xrm._2011.contracts.services.RetrieveResponseDocument;
import com.microsoft.schemas.xrm._2011.contracts.services.UpdateDocument;
import com.microsoft.schemas.xrm._2011.contracts.services.UpdateDocument.Update;
import com.microsoft.schemas.xrm._2011.contracts.services.UpdateResponseDocument;

public class Main {

	static Logger logger = Logger.getLogger(Main.class.getName());

	/**
	 * Microsoft account (e.g. youremail@live.com) or Microsoft Office 365 (Org
	 * ID e.g. youremail@yourorg.onmicrosoft.com) User Name.
	 */
	private static final String UserName = "nbuddharaju@gnanatest.onmicrosoft.com"; // "youremail@yourorg.onmicrosoft.com";
	/**
	 * Microsoft account or Microsoft Office 365 (Org ID) Password.
	 */
	private static final String UserPassword = "jyoRavi12";
	/**
	 * Unique Name of the organization
	 */
	private static final String OrganizationUniqueName = "org436c8efe";
	/**
	 * URL for the Discovery Service For North America Microsoft account,
	 * discovery service url is
	 * https://dev.crm.dynamics.com/XRMServices/2011/Discovery.svc Microsoft
	 * office 365, discovery service url is
	 * https://disco.crm.dynamics.com/XRMServices/2011/Discovery.svc To use
	 * appropriate discovery service url for other environments refer
	 * http://technet.microsoft.com/en-us/library/gg309401.aspx
	 */
	private static final String DiscoveryServiceURL = "https://disco.crm8.dynamics.com/XRMServices/2011/Discovery.svc";
	/**
	 * Suffix for the Flat WSDL
	 */
	private static final String FlatWSDLSuffix = "?wsdl";

	/**
	 * Standard Main() method used by most SDK samples.
	 * 
	 * @param args
	 * @throws IOrganizationService_Delete_OrganizationServiceFaultFault_FaultMessage
	 * @throws IDiscoveryService_Execute_DiscoveryServiceFaultFault_FaultMessage
	 * @throws XMLStreamException
	 * @throws IOrganizationService_Create_OrganizationServiceFaultFault_FaultMessage
	 * @throws IOrganizationService_Retrieve_OrganizationServiceFaultFault_FaultMessage
	 * @throws IOrganizationService_Update_OrganizationServiceFaultFault_FaultMessage
	 */
	public static void main(String[] args)
			throws IOrganizationService_Delete_OrganizationServiceFaultFault_FaultMessage,
			IDiscoveryService_Execute_DiscoveryServiceFaultFault_FaultMessage, XMLStreamException,
			IOrganizationService_Create_OrganizationServiceFaultFault_FaultMessage,
			IOrganizationService_Retrieve_OrganizationServiceFaultFault_FaultMessage,
			IOrganizationService_Update_OrganizationServiceFaultFault_FaultMessage {
		try {
			System.out.println("Starting main...");
			// Retrieve the authentication policy for the discovery service.
			OnlineAuthenticationPolicy discoveryPolicy = new OnlineAuthenticationPolicy(
					DiscoveryServiceURL + FlatWSDLSuffix);
			WsdlTokenManager discoeryTokenManager = new WsdlTokenManager();
			// Authenticate the user using the discovery authentication policy.
			SecurityData discoverySecurityData = discoeryTokenManager.authenticate(DiscoveryServiceURL, UserName,
					UserPassword, discoveryPolicy.getAppliesTo(), discoveryPolicy.getPolicy(),
					discoveryPolicy.getIssuerUri());

			// Retrieve discovery stub using organization URL with the security
			// data.
			DiscoveryServiceStub discoveryServiceStub = createDiscoveryServiceStub(DiscoveryServiceURL,
					discoverySecurityData);

			// Retrieve organization service url using discovery stub.
			String orgUrl = discoverOrganizationUrl(discoveryServiceStub, OrganizationUniqueName);
			System.out.println("org url is " + orgUrl);
			// The discovery service stub cannot be reused against the
			// organization service
			// as the Issuer and AppliesTo may differ between the discovery and
			// organization services.
			// Retrieve the authentication policy for the organization service.
			OnlineAuthenticationPolicy organizationPolicy = new OnlineAuthenticationPolicy(orgUrl + FlatWSDLSuffix);
			WsdlTokenManager orgTokenManager = new WsdlTokenManager();
			// Authenticate the user using the organization authentication
			// policy.
			SecurityData securityData = orgTokenManager.authenticate(orgUrl, UserName, UserPassword,
					organizationPolicy.getAppliesTo(), organizationPolicy.getPolicy(),
					organizationPolicy.getIssuerUri());

			// Retrieve organization stub using organization URL with the
			// security data.
			OrganizationServiceStub serviceStub = createOrganizationServiceStub(orgUrl, securityData);

			// Create an sample account record.
			Guid newAccountGUID = createAccount(serviceStub);

			// Retrieve the sample account record.
			readAccount(serviceStub, newAccountGUID);

			// Update the sample account record.
			updateAccount(serviceStub, newAccountGUID);

			// Retrieve updated sample account record.
			readAccount(serviceStub, newAccountGUID);

			Scanner scanner = new Scanner(System.in);
			System.out.println("\nDo you want this sample account record deleted? (y/n) [y]: ");
			String answer = scanner.nextLine();

			if (!answer.startsWith("n") || !answer.startsWith("N")) {
				// Delete the sample account record.
				deleteAccount(serviceStub, newAccountGUID);
			}

			// } catch (IllegalStateException e) {
			// logger.error(e.getMessage());
			// } catch (SAXException e) {
			// logger.error(e.getMessage());
			// } catch (ParserConfigurationException e) {
			// logger.error(e.getMessage());
			// } catch (DeviceRegistrationFailedException e) {
			// logger.error(e.getMessage());
			// } catch (IOException e) {
			// logger.error(e.getMessage());
			// } catch (XPathExpressionException e) {
			// logger.error(e.getMessage());
			// } catch (URISyntaxException e) {
			// logger.error(e.getMessage());
			// } catch (WSDLException e) {
			// logger.error(e.getMessage());
		} catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		}
	}

	private static OrganizationServiceStub createOrganizationServiceStub(String organizationServiceURL,
			SecurityData securityData) throws RemoteException, XMLStreamException {
		try {
			OrganizationServiceStub stub = new OrganizationServiceStub(getConfigurationContext(),
					organizationServiceURL);
			setServiceClientOptions(stub._getServiceClient(), securityData);
			return stub;
		} catch (RemoteException e) {
			logger.error(e.getMessage());
			e.printStackTrace();
			throw e;
		}
	}

	private static DiscoveryServiceStub createDiscoveryServiceStub(String discoveryServiceURL,
			SecurityData securityData) throws RemoteException, XMLStreamException {
		try {
			DiscoveryServiceStub stub = new DiscoveryServiceStub(getConfigurationContext(), discoveryServiceURL);
			setServiceClientOptions(stub._getServiceClient(), securityData);
			return stub;
		} catch (RemoteException e) {
			logger.error(e.getMessage());
			e.printStackTrace();
			throw e;
		}
	}

	private static void setServiceClientOptions(ServiceClient sc, SecurityData securityData)
			throws AxisFault, XMLStreamException {
		Options options = sc.getOptions();

		options.setMessageId("urn:uuid:" + UUID.randomUUID().toString());

		EndpointReference endPoint = new EndpointReference("http://www.w3.org/2005/08/addressing/anonymous");
		options.setReplyTo(endPoint);

		sc.setOptions(options);
		sc.addHeader(createCRMSecurityHeaderBlock(securityData));
		try {
			sc.engageModule("addressing");
		} catch (AxisFault e) {
			logger.error(e.getMessage());
			e.printStackTrace();
			throw e;
		}
	}

	private static ConfigurationContext getConfigurationContext() throws AxisFault {
		String workingDirectory = System.getProperty("user.dir");
		String fileSeperator = System.getProperty("file.separator");
		String pathToAxis2File = workingDirectory + fileSeperator + "src" + fileSeperator + "axis2.xml";

		logger.debug("Working directory: " + workingDirectory);
		logger.debug("Path to Axis2.xml file: " + pathToAxis2File);

		ConfigurationContext ctx;
		try {
			ctx = ConfigurationContextFactory.createConfigurationContextFromFileSystem(workingDirectory,
					pathToAxis2File);
		} catch (AxisFault e) {
			logger.error(e.getMessage());
			e.printStackTrace();
			throw e;
		}
		return ctx;
	}

	private static SOAPHeaderBlock createCRMSecurityHeaderBlock(SecurityData securityData) throws XMLStreamException {
		RequestDateTimeData dateTimeData = WsdlTokenManager.getRequestDateTime();

		String currentDateTime = dateTimeData.getCreatedDateTime();
		String expireDateTime = dateTimeData.getExpiresDateTime();

		String securityHeaderTemplate = "<EncryptedData " + "    xmlns=\"http://www.w3.org/2001/04/xmlenc#\""
				+ "     Id=\"Assertion0\" " + "    Type=\"http://www.w3.org/2001/04/xmlenc#Element\">"
				+ "    <EncryptionMethod " + "        Algorithm=\"http://www.w3.org/2001/04/xmlenc#tripledes-cbc\"/>"
				+ "    <ds:KeyInfo " + "        xmlns:ds=\"http://www.w3.org/2000/09/xmldsig#\">"
				+ "        <EncryptedKey>" + "            <EncryptionMethod "
				+ "                Algorithm=\"http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p\"/>"
				+ "            <ds:KeyInfo Id=\"keyinfo\">" + "                <wsse:SecurityTokenReference "
				+ "                    xmlns:wsse=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd\">"
				+ "                    <wsse:KeyIdentifier "
				+ "                        EncodingType=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-soap-message-security-1.0#Base64Binary\" "
				+ "                        ValueType=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-x509-token-profile-1.0#X509SubjectKeyIdentifier\">%s</wsse:KeyIdentifier>"
				+ "                </wsse:SecurityTokenReference>" + "            </ds:KeyInfo>"
				+ "            <CipherData>" + "                <CipherValue>%s</CipherValue>"
				+ "            </CipherData>" + "        </EncryptedKey>" + "    </ds:KeyInfo>" + "    <CipherData>"
				+ "        <CipherValue>%s</CipherValue>" + "    </CipherData>" + "</EncryptedData>";

		String securityHeader = String.format(securityHeaderTemplate, securityData.getKeyIdentifier(),
				securityData.getSecurityToken0(), securityData.getSecurityToken1());

		try {

			OMFactory factory = OMAbstractFactory.getOMFactory();
			OMNamespace securityNS = factory.createOMNamespace(
					"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "o");
			OMNamespace utitlityNS = factory.createOMNamespace(
					"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd", "u");

			OMElement timeStamp = factory.createOMElement("Timestamp", utitlityNS);
			timeStamp.addAttribute("Id", "_0", utitlityNS);

			OMElement created = factory.createOMElement("Created", utitlityNS);
			OMText createdTime = factory.createOMText(currentDateTime + "Z");
			created.addChild(createdTime);

			OMElement expires = factory.createOMElement("Expires", utitlityNS);
			OMText expiresTime = factory.createOMText(expireDateTime + "Z");
			expires.addChild(expiresTime);

			timeStamp.addChild(created);
			timeStamp.addChild(expires);

			SOAPHeaderBlock wsseHeader = OMAbstractFactory.getSOAP12Factory().createSOAPHeaderBlock("Security",
					securityNS);
			wsseHeader.setMustUnderstand(true);

			wsseHeader.addChild(timeStamp);
			wsseHeader.addChild(AXIOMUtil.stringToOM(factory, securityHeader));

			return wsseHeader;
		} catch (XMLStreamException e) {
			logger.error(e.getMessage());
			e.printStackTrace();
			throw e;
		}
	}

	private static Guid createAccount(OrganizationServiceStub serviceStub) throws XmlException, RemoteException,
			IOrganizationService_Create_OrganizationServiceFaultFault_FaultMessage {
		try {
			CreateDocument createDocument = CreateDocument.Factory.newInstance();
			Create entry = createDocument.addNewCreate();

			Entity newEntryInfo = Entity.Factory.newInstance();

			AttributeCollection collection = AttributeCollection.Factory.newInstance();
			KeyValuePairOfstringanyType values = collection.addNewKeyValuePairOfstringanyType();
			values.setKey("name");
			values.setValue(setStringObject("TestRaviB"));

			newEntryInfo.setAttributes(collection);
			newEntryInfo.setLogicalName("account");

			entry.setEntity(newEntryInfo);

			CreateResponseDocument createResponse = serviceStub.create(createDocument);
			Guid createResultGuid = createResponse.getCreateResponse().xgetCreateResult();

			System.out.println("New Account GUID: " + createResultGuid.toString());

			return createResultGuid;
		} catch (IOrganizationService_Create_OrganizationServiceFaultFault_FaultMessage e) {
			logger.error(e.getMessage());
			e.printStackTrace();
			throw e;
		} catch (RemoteException e) {
			logger.error(e.getMessage());
			e.printStackTrace();
			throw e;
		} catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
			throw e;
		}
	}

	private static void readAccount(OrganizationServiceStub serviceStub, Guid guid)
			throws IOrganizationService_Retrieve_OrganizationServiceFaultFault_FaultMessage, RemoteException {
		try {
			RetrieveDocument retrieveDocument = RetrieveDocument.Factory.newInstance();
			Retrieve read = retrieveDocument.addNewRetrieve();

			ColumnSet colSet = read.addNewColumnSet();
			ArrayOfstring cols = colSet.addNewColumns();
			cols.setStringArray(new String[] { "name", "telephone1", "address1_city", "emailaddress1",
					"address1_postalcode", "lastusedincampaign" });

			read.xsetId(guid);
			read.setEntityName("account");

			System.out.println("Reading account: " + guid.toString());

			RetrieveResponseDocument response = serviceStub.retrieve(retrieveDocument);
			System.out.println("response is read");
			Entity result = response.getRetrieveResponse().getRetrieveResult();
			System.out.println("result is retrieved");

			AttributeCollection attributes = result.getAttributes();
			KeyValuePairOfstringanyType[] keyValuePairs = attributes.getKeyValuePairOfstringanyTypeArray();

			for (int i = 0; i < keyValuePairs.length; i++) {
				System.out.print(keyValuePairs[i].getKey() + ": ");
				System.out.println(keyValuePairs[i].getValue());
			}
		} catch (IOrganizationService_Retrieve_OrganizationServiceFaultFault_FaultMessage e) {
			logger.error(e.getMessage(), e);
			e.printStackTrace();
			throw e;
		} catch (RemoteException e) {
			logger.error(e.getMessage());
			e.printStackTrace();

			throw e;
		}
	}

	private static void updateAccount(OrganizationServiceStub serviceStub, Guid guid)
			throws IOrganizationService_Update_OrganizationServiceFaultFault_FaultMessage, RemoteException, Exception {
		try {
			UpdateDocument updateDocument = UpdateDocument.Factory.newInstance();
			Update updateEntry = updateDocument.addNewUpdate();
			Entity updateInfo = updateEntry.addNewEntity();

			AttributeCollection updateCollection = updateInfo.addNewAttributes();
			KeyValuePairOfstringanyType telephone = updateCollection.addNewKeyValuePairOfstringanyType();

			telephone.setKey("telephone1");
			telephone.setValue(setStringObject("425-555-1212"));
			KeyValuePairOfstringanyType city = updateCollection.addNewKeyValuePairOfstringanyType();
			city.setKey("address1_city");
			city.setValue(setStringObject("Bellevue"));
			KeyValuePairOfstringanyType email = updateCollection.addNewKeyValuePairOfstringanyType();
			email.setKey("emailaddress1");
			email.setValue(setStringObject("someone@example.com"));

			updateInfo.xsetId(guid);
			updateInfo.setLogicalName("account");

			System.out.println("Updating account: " + guid.toString());

			UpdateResponseDocument updateResponse = serviceStub.update(updateDocument);
			System.out.println(updateResponse);
		} catch (IOrganizationService_Update_OrganizationServiceFaultFault_FaultMessage e) {
			logger.error(e.getMessage());
			throw e;
		} catch (RemoteException e) {
			logger.error(e.getMessage());
			throw e;
		} catch (Exception e) {
			logger.error(e.getMessage());
			throw e;
		}
	}

	private static XmlString setStringObject(String value) {
		XmlString newInstance = XmlString.Factory.newInstance();
		newInstance.setStringValue(value);
		return newInstance;
	}

	private static void deleteAccount(OrganizationServiceStub serviceStub, Guid guid)
			throws IOrganizationService_Delete_OrganizationServiceFaultFault_FaultMessage, RemoteException {
		try {
			DeleteDocument deleteDocument = DeleteDocument.Factory.newInstance();
			Delete deleteEntry = deleteDocument.addNewDelete();

			deleteEntry.xsetId(guid);
			deleteEntry.setEntityName("account");

			serviceStub.delete(deleteDocument);
			System.out.println("Deleted account: " + guid.toString());
		} catch (IOrganizationService_Delete_OrganizationServiceFaultFault_FaultMessage e) {
			logger.error(e.getMessage());
			throw e;
		} catch (RemoteException e) {
			logger.error(e.getMessage());
			throw e;
		}
	}

	private static String discoverOrganizationUrl(DiscoveryServiceStub serviceStub, String organizationUniqueName)
			throws RemoteException, IDiscoveryService_Execute_DiscoveryServiceFaultFault_FaultMessage {
		try {
			
//			ExecuteDocument executeDocument = ExecuteDocument.Factory.newInstance();
//			Execute execute = executeDocument.addNewExecute();
//			RetrieveOrganizationRequest request = (RetrieveOrganizationRequest) execute.addNewRequest();
//
			RetrieveOrganizationRequestDocument requestDocument = RetrieveOrganizationRequestDocument.Factory.newInstance();
			RetrieveOrganizationRequest request = requestDocument.addNewRetrieveOrganizationRequest();
			// RetrieveOrganizationsRequestDocument executeDocument =
			// RetrieveOrganizationsRequestDocument.Factory.newInstance();
			//// ExecuteDocument executeDocument =
			// ExecuteDocument.Factory.newInstance();
			// RetrieveOrganizationsRequest request =
			// executeDocument2.addNewRetrieveOrganizationsRequest();
			// DiscoveryServiceStub.RetrieveOrganizationRequest request = new
			// DiscoveryServiceStub.RetrieveOrganizationRequest();
			request.setUniqueName(organizationUniqueName);
			
			ExecuteDocument executeDocument = ExecuteDocument.Factory.newInstance();
			Execute addNewExecute = executeDocument.addNewExecute();
			addNewExecute.setRequest(request);
			// DiscoveryServiceStub.Execute exe = new
			// DiscoveryServiceStub.Execute();
			// exe.setRequest(request);
//			serviceStub.execute();
			 ExecuteResponseDocument execute = serviceStub.execute(executeDocument);

//			RetrieveOrganizationResponseDocument response = (RetrieveOrganizationResponseDocument) execute;
			System.out.println(execute);
			// DiscoveryServiceStub.ExecuteResponse response =
			// serviceStub.execute(exe);
			
//			RetrieveOrganizationResponse executeResponse = response.getRetrieveOrganizationResponse();
//			OrganizationDetail detail = executeResponse.getDetail();
//			// DiscoveryServiceStub.RetrieveOrganizationResponse result =
//			// (RetrieveOrganizationResponse) response.getExecuteResult();
//			//
			// OrganizationDetail orgDetail = result.getDetail();
//			//
			ExecuteResponse response = execute.getExecuteResponse();
			System.out.println("got respose");
			RetrieveOrganizationResponse result = (RetrieveOrganizationResponse)response.getExecuteResult();
			System.out.println("got result");
			OrganizationDetail detail = result.getDetail();
			System.out.println("got detail");
			KeyValuePairOfEndpointTypestringztYlk6OT[] keyValuePairs = detail.getEndpoints()
					.getKeyValuePairOfEndpointTypestringztYlk6OTArray();
			// KeyValuePairOfEndpointTypestringztYlk6OT[] keyValuePairs =
			// orgDetail.getEndpoints().getKeyValuePairOfEndpointTypestringztYlk6OT();

			for (int i = 0; i < keyValuePairs.length; i++) {
				if (keyValuePairs[i].getKey() == EndpointType.ORGANIZATION_SERVICE) {
					System.out.println(keyValuePairs[i].getValue());
					return keyValuePairs[i].getValue();
				}
			}
		} catch (RemoteException e) {
			logger.error(e.getMessage());
			e.printStackTrace();
			throw e;
		} catch (IDiscoveryService_Execute_DiscoveryServiceFaultFault_FaultMessage e) {
			logger.error(e.getMessage());
			e.printStackTrace();
			throw e;
		}
		return null;
	}

}
