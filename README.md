# The New Maps Project Redistricting Algorithm v1.1

## Updates: v1.1 
Effective Aug 24 2020  
No Breaking Changes  
  
**Changes:**
1. The algorithm now handles remaining towns after all the districts are added beyond the population threshold differently. Instead of searching for the closest district by center of its population and adding the town to that district, each leftover town is added to the district of its closest town that has been assigned a district.

## How to use:

Run with JDK 11+  
Download Repository and open it in your desired program. You may need to configure and move around files to run the program in specific IDE or Editor. (All code for the algorithm is in the "src" folder, run "Main.java")  
Put an input file in "inputfiles" directory, see below for the format of this file.    
Run Main.java in the "src" directory with 4 command line arguments: state name, input file name (in the "inputfiles" directory), # of districts, threshold (as a decimal percent)  
**Example Program Arguments:** "Rhode Island" "sampleinput.txt" "2" "0.95"

### Input File Format: 
**Will not work if not in this format:** .txt files with Comma separated values. Each line: town name, population, latitude, longitude (latitude and longitude are numerical values, do not put N/S/E/W).

**Example:**  
  
Providence,179883,41.8239891,-71.4128343  
Cranston,81456,41.7798226,-71.4372796  
Warwick,81004,41.7001009,-71.4161671  
Pawtucket,72117,41.878711,-71.38255579999999  
East Providence,47618,41.8137116,-71.3700545  
Woonsocket,41751,42.00287609999999,-71.51478390000001  
...   


### Retrieve Output Data: 
After the algorithm is complete, it will write to the **results.txt** file in the root directory. File format is: First Line: State name,threshold (as a decimal). Following lines: town name, district #, latitude, longitude, population

**Example:**  
    
Massachusetts,0.95  
Boston,1,42.361799621354926,-71.05746810205792,692600  
Chelsea,1,42.3917638,-71.0328284,39690,   
Worcester,2,42.29045342556963,-71.70299110368317,185428  
Auburn,2,42.1945385,-71.8356271,16766  
Millbury,2,42.19207189999999,-71.761522,13947  
Shrewsbury,2,42.2959267,-71.71284709999999,38526  
Leicester,2,42.245926,-71.90868429999999,11341  
...  

### Sample Input Files
In the folder "inputfiles", there are text files that have data corresponding to the US state name (Ex: westviginia.txt contains data from West Virginian towns). These files are already in the specified CSV format for input files
