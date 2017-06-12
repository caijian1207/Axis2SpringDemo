
/**
 * WebServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package com.zeychen.axis2.client.stub;

    /**
     *  WebServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class WebServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public WebServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public WebServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for working method
            * override this method for handling normal response from working operation
            */
           public void receiveResultworking(
                    com.zeychen.axis2.client.stub.WebServiceStub.WorkingResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from working operation
           */
            public void receiveErrorworking(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for hello method
            * override this method for handling normal response from hello operation
            */
           public void receiveResulthello(
                    com.zeychen.axis2.client.stub.WebServiceStub.HelloResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from hello operation
           */
            public void receiveErrorhello(java.lang.Exception e) {
            }
                
               // No methods generated for meps other than in-out
                


    }
    