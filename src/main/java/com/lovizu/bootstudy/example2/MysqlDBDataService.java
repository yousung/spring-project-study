package com.lovizu.bootstudy.example2;

import org.springframework.stereotype.Component;

@Component
public class MysqlDBDataService implements DataService {

  public int[] retrieveData() {
    return new int[]{1, 2, 3, 4, 5};

  }
}
