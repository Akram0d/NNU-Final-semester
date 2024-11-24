#!/usr/bin/env python3
# -*- coding: utf-8 -*-
# */AIPND-revision/intropyproject-classify-pet-images/adjust_results4_isadog.py
#                                                                             
# PROGRAMMER: Akram Odeh
# DATE CREATED:  4/11/2024                        
# REVISED DATE: 5/11/2024
# PURPOSE: Create a function adjust_results4_isadog that adjusts the results 
#          dictionary to indicate whether or not the pet image label is of-a-dog, 
#          and to indicate whether or not the classifier image label is of-a-dog.
#          All dog labels from both the pet images and the classifier function
#          will be found in the dognames.txt file. We recommend reading all the
#          dog names in dognames.txt into a dictionary where the 'key' is the 
#          dog name (from dognames.txt) and the 'value' is one. If a label is 
#          found to exist within this dictionary of dog names then the label 
#          is of-a-dog, otherwise the label isn't of a dog. Alternatively one 
#          could also read all the dog names into a list and then if the label
#          is found to exist within this list - the label is of-a-dog, otherwise
#          the label isn't of a dog. 
#         This function inputs:
#            -The results dictionary as results_dic within adjust_results4_isadog 
#             function and results for the function call within main.
#            -The text file with dog names as dogfile within adjust_results4_isadog
#             function and in_arg.dogfile for the function call within main. 
#           This function uses the extend function to add items to the list 
#           that's the 'value' of the results dictionary. You will be adding the
#           whether or not the pet image label is of-a-dog as the item at index
#           3 of the list and whether or not the classifier label is of-a-dog as
#           the item at index 4 of the list. Note we recommend setting the values
#           at indices 3 & 4 to 1 when the label is of-a-dog and to 0 when the 
#           label isn't a dog.


def adjust_results4_isadog(results_dic, dogfile):
          
    # Creates dognames Dictionary
    dognames_dic = dict()

    # Reads in dog names from file
    with open(dogfile, "r") as infile:
        line = infile.readline()

        while line !="":
            # Remove the newline character from the variable line
            dog_name = line.rstrip()  
            
            # Check if the dogname already exists in dognames_dic
            if dog_name not in dognames_dic:
                # Add dogname to dognames_dic as the key (1)
                dognames_dic[dog_name] = 1  
            else:
                print(f"Warning: Duplicate dog name found - {dog_name}")

            line = infile.readline()


    # Add to whether pet labels & classifier labels are dogs...
    for key in results_dic:
        pet_label = results_dic[key][0]   
        classifier_label = results_dic[key][1]

        # Check if the pet label is a dog
        if pet_label in dognames_dic:

            # If Pet image is a dog
            results_dic[key].extend([1]) 
             
        else:
            # If Pet image is NOT a dog
            results_dic[key].extend([0])   

        # Check if the classifier label is a dog
        if classifier_label in dognames_dic:

            # If Classifier label is a dog
            results_dic[key].extend([1])  
        else:
            # If Classifier label is NOT a dog
            results_dic[key].extend([0])  

    

