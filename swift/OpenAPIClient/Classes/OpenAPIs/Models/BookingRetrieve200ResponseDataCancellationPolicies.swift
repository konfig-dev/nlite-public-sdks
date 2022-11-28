//
// BookingRetrieve200ResponseDataCancellationPolicies.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct BookingRetrieve200ResponseDataCancellationPolicies: Codable, JSONEncodable, Hashable {

    public var cancelPolicyInfos: AnyCodable?
    public var hotelRemarks: AnyCodable?

    public init(cancelPolicyInfos: AnyCodable? = nil, hotelRemarks: AnyCodable? = nil) {
        self.cancelPolicyInfos = cancelPolicyInfos
        self.hotelRemarks = hotelRemarks
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case cancelPolicyInfos
        case hotelRemarks
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(cancelPolicyInfos, forKey: .cancelPolicyInfos)
        try container.encodeIfPresent(hotelRemarks, forKey: .hotelRemarks)
    }
}
