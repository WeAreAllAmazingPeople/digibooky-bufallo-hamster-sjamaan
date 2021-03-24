package com.switchfully.digibooky.domain.repositories;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BooksRepositoryTest {

   @Test

   void BooksRepository_givenNullBookCollection_shouldConstruct(){
      new BooksRepository(null);


   }


}