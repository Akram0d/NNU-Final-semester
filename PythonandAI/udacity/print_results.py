#!/usr/bin/env python3
# -*- coding: utf-8 -*-
# */AIPND-revision/intropyproject-classify-pet-images/print_results.py
#                                                                             
# PROGRAMMER: Akram Odeh
# DATE CREATED: 4/11/2024
# REVISED DATE: 5/11/2024
# PURPOSE: Create a function print_results that prints the results statistics
#          from the results statistics dictionary (results_stats_dic). It 
#          should also allow the user to be able to print out cases of misclassified
#          dogs and cases of misclassified breeds of dog using the Results 
#          dictionary (results_dic).  
#         This function inputs:
#            -The results dictionary as results_dic within print_results 
#             function and results for the function call within main.
#            -The results statistics dictionary as results_stats_dic within 
#             print_results function and results_stats for the function call within main.
#            -The CNN model architecture as model wihtin print_results function
#             and in_arg.arch for the function call within main. 
#            -Prints Incorrectly Classified Dogs as print_incorrect_dogs within
#             print_results function and set as either boolean value True or 
#             False in the function call within main (defaults to False)
#            -Prints Incorrectly Classified Breeds as print_incorrect_breed within
#             print_results function and set as either boolean value True or 
#             False in the function call within main (defaults to False)
#         This function does not output anything other than printing a summary
#         of the final results.
 
def print_results(results_dic, results_stats_dic, model, 
                  print_incorrect_dogs=False, print_incorrect_breed=False):
   
    # Prints summary statistics over the run
    print("\n\n*** Results Summary for CNN Model Architecture", model.upper(), "***")
    print("{:20}: {:3d}".format('N Images', results_stats_dic['n_images']))
    print("{:20}: {:3d}".format('N Dog Images', results_stats_dic['n_dogs_img']))
    
    # Prints the number of Not a Dog Images
    print("{:20}: {:3d}".format('N Not-Dog Images', results_stats_dic['n_notdogs_img']))
    
    # Prints summary statistics (percentages) on Model Run
    print("\nPercentage Statistics:")

    # process through result dictionary using key and value
    print("Summary Statistics (Percentages):")
    for key in results_stats_dic:

    # Percentage value
        if key.startswith('pct'):
           print(f"{key:20}: {results_stats_dic[key]:.2f}%")


    # If user wants incorrect dogs printed and there are misclassified dogs
    if print_incorrect_dogs and (results_stats_dic['n_correct_dogs'] + results_stats_dic['n_correct_notdogs'] != results_stats_dic['n_images']):
        print("\nINCORRECT Dog/NOT Dog Assignments:")
        
        for key in results_dic:

            # If labels disagree on whether image is a dog or not
            if sum(results_dic[key][3:]) == 1:
                print("Pet label: {:>20}  Classifier label: {:>20}".format(results_dic[key][0], results_dic[key][1]))

    # If user wants incorrect breeds printed and there are misclassified breeds
    if print_incorrect_breed and (results_stats_dic['n_correct_dogs'] != results_stats_dic['n_correct_breed']):
        print("\nINCORRECT Dog Breed Assignments:")

        for key in results_dic:
            
            # Pet Image Label is-a-Dog, classified as-a-dog but is WRONG breed
            if sum(results_dic[key][3:]) == 2 and results_dic[key][2] == 0:
                print("Pet label: {:>20}  Classifier label: {:>20}".format(results_dic[key][0], results_dic[key][1]))
