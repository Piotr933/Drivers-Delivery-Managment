package com.piotrzawada.driversdeliverymanagement;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Driver {
    final String id, name, runs, location, status;
}
