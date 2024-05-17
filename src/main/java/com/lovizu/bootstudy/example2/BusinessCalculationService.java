package com.lovizu.bootstudy.example2;

import java.util.Arrays;
import org.springframework.stereotype.Component;

@Component
public class BusinessCalculationService {

  private final DataService dataService;

  public BusinessCalculationService(DataService dataService) {
    super();
    this.dataService = dataService;
  }

  public int findMax() {

    return Arrays.stream(dataService.retrieveData()).max().orElse(0);
  }
}
