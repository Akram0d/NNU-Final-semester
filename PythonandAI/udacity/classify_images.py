#!/usr/bin/env python3
# -*- coding: utf-8 -*-
# */AIPND-revision/intropyproject-classify-pet-images/classify_images.py
#                                                                             
# PROGRAMMER: Akram ODeh
# DATE CREATED: 4/11/2024                                
# REVISED DATE: 5/11/2024
# PURPOSE: Create a function classify_images that uses the classifier function 
#          to create the classifier labels and then compares the classifier 
#          labels to the pet image labels. This function inputs:
#            -The Image Folder as image_dir within classify_images and function 
#             and as in_arg.dir for function call within main. 
#            -The results dictionary as results_dic within classify_images 
#             function and results for the functin call within main.
#            -The CNN model architecture as model wihtin classify_images function
#             and in_arg.arch for the function call within main. 
#           This function uses the extend function to add items to the list 
#           that's the 'value' of the results dictionary. You will be adding the
#           classifier label as the item at index 1 of the list and the comparison 
#           of the pet and classifier labels as the item at index 2 of the list.
#

from classifier import classifier 

def classify_images(images_dir, results_dic, model):

     # Through all files in dictionary
    for key in results_dic:

         # The full image path
        image_path = images_dir + key 
        # Set the string variable to classifier function
        model_label = classifier(image_path, model)  
        
        # string variable is lowercased and striped
        model_label = model_label.lower().strip()  
        
        # Defines truth as pet image label 
        truth = results_dic[key][0]

        # If pet image label found, add to result dictionary as a match(1)
        if truth in model_label:
            results_dic[key].extend([model_label, 1])  

        # Else add to result dictionary as not a match(0)
        else:
            results_dic[key].extend([model_label, 0])  
