package com.piotrzawada.driversdeliverymanagement;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Route {
    final String id, firstLoc, lastLoc, stops;
}
