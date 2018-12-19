/** 
 
Copyright 2013 Intel Corporation, All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License. 
*/ 

package com.intel.cosbench.model;

public interface ControllerInfo {

    public String getName();

    public String getUrl();

    public int getDriverCount();

    public DriverInfo[] getDriverInfos();
    
    public String getBucket_policy();
    
    public String getBucket_lifecycle_configuration();
    
    public String getBucket_cross_origin_configuration();
    
    public String getBucket_website_configuration();

}
