/*
 Copyright 2015 Lukas Plechinger

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

package at.plechinger.minigeocode.data;

import lombok.Data;

/**
 * The Result of the Geocoding Process
 */
@Data
public class GeocodeResult {

    private String street;
    private String housenumber;
    private String postcode;
    private String city;
    private String country;
    private Double longitude;
    private Double latitude;
}