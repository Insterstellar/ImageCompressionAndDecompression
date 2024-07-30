package org.imagecompression;

import org.imagecompression.utils.ImageUtils;

import java.io.IOException;
import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //for spring use to handle multiPartFiles . Call either of the methods from the ImageUtils class to take action.

        //Example use case.
  //---------------------------------------------------------------------------------------------------------------//
     /*   @PostMapping("/all")
        public String saveCategories( MultipartFile multipartFile)
        {
            Date date = new Date();
            String fileName = date.getTime()+"categories"+multipartFile.getOriginalFilename();



            ImageData imageData= imageDataService.saveImage(ImageData.builder()
                    .name(fileName)
                    .type(multipartFile.getContentType())
                    //compress image
                    .imageData(ImageUtils.compressImage(multipartFile.getBytes()))
                    .build());



            System.out.println("picture name or file name----------------------------- "+ imageData.getClass().getName());

            return imageData.getClass().getName().toString;
        }*/

//---------------------------------------------------------------------------------------------------------------//
    }
}