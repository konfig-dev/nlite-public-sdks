/**
 * nlite API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import RateBook200ResponseDataBookedRoomsInnerRateRetailRate from './RateBook200ResponseDataBookedRoomsInnerRateRetailRate';

/**
 * The RateBook200ResponseDataBookedRoomsInnerRate model module.
 * @module model/RateBook200ResponseDataBookedRoomsInnerRate
 * @version 1.0.0
 */
class RateBook200ResponseDataBookedRoomsInnerRate {
    /**
     * Constructs a new <code>RateBook200ResponseDataBookedRoomsInnerRate</code>.
     * @alias module:model/RateBook200ResponseDataBookedRoomsInnerRate
     */
    constructor() { 
        
        RateBook200ResponseDataBookedRoomsInnerRate.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>RateBook200ResponseDataBookedRoomsInnerRate</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/RateBook200ResponseDataBookedRoomsInnerRate} obj Optional instance to populate.
     * @return {module:model/RateBook200ResponseDataBookedRoomsInnerRate} The populated <code>RateBook200ResponseDataBookedRoomsInnerRate</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new RateBook200ResponseDataBookedRoomsInnerRate();

            if (data.hasOwnProperty('maxOccupancy')) {
                obj['maxOccupancy'] = ApiClient.convertToType(data['maxOccupancy'], 'Number');
            }
            if (data.hasOwnProperty('retailRate')) {
                obj['retailRate'] = RateBook200ResponseDataBookedRoomsInnerRateRetailRate.constructFromObject(data['retailRate']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>RateBook200ResponseDataBookedRoomsInnerRate</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>RateBook200ResponseDataBookedRoomsInnerRate</code>.
     */
    static validateJSON(data) {
        // validate the optional field `retailRate`
        if (data['retailRate']) { // data not null
          RateBook200ResponseDataBookedRoomsInnerRateRetailRate.validateJSON(data['retailRate']);
        }

        return true;
    }


}



/**
 * @member {Number} maxOccupancy
 */
RateBook200ResponseDataBookedRoomsInnerRate.prototype['maxOccupancy'] = undefined;

/**
 * @member {module:model/RateBook200ResponseDataBookedRoomsInnerRateRetailRate} retailRate
 */
RateBook200ResponseDataBookedRoomsInnerRate.prototype['retailRate'] = undefined;






export default RateBook200ResponseDataBookedRoomsInnerRate;
