#!/usr/bin/env python3
# -*- coding: utf-8 -*-
# */AIPND-revision/intropyproject-classify-pet-images/get_pet_labels.py
#
# PROGRAMMER: Akram Odeh
# DATE CREATED: 4/11/2024                          
# REVISED DATE: 5/11/2024
# PURPOSE: Create the function get_pet_labels that creates the pet labels from 
#          the image's filename. This function inputs: 
#           - The Image Folder as image_dir within get_pet_labels function and 
#             as in_arg.dir for the function call within the main function. 
#          This function creates and returns the results dictionary as results_dic
#          within get_pet_labels function and as results within main. 
#          The results_dic dictionary has a 'key' that's the image filename and
#          a 'value' that's a list. This list will contain the following item
#          at index 0 : pet image label (string).

from os import listdir

def get_pet_labels(image_dir):
  
    # Creates list of files in image_dir
    in_files = listdir(image_dir)

    # Creates empty dictionary for the results (pet labels, etc.)
    results_dic = dict()
   
    for idx in range(0, len(in_files), 1):

       # Skips file if starts with . (like .DS_Store of Mac OSX) because it 
       # isn't an pet image file
        if in_files[idx][0] != ".": 

           # Creates temporary label variable to hold pet label name extracted 
            pet_label = ""

            # Split the filename into words
            word_list_pet_image = in_files[idx].lower().split("_")
            for word in word_list_pet_image:

                # Check if the split word name is letters 
                if word.isalpha():  
                    pet_label += word + " "  

            pet_label = pet_label.strip()  

            # Add to the dictionary if the filename is not already a key
            if in_files[idx] not in results_dic:
                results_dic[in_files[idx]] = [pet_label]
            else:
                print("** Warning: Duplicate files exist in directory:", in_files[idx])
 
    return results_dic
