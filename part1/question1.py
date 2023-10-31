################################################################################
#     ____                          __     _                          ___
#    / __ \  __  __  ___    _____  / /_   (_)  ____    ____          <  /
#   / / / / / / / / / _ \  / ___/ / __/  / /  / __ \  / __ \         / / 
#  / /_/ / / /_/ / /  __/ (__  ) / /_   / /  / /_/ / / / / /        / /  
#  \___\_\ \__,_/  \___/ /____/  \__/  /_/   \____/ /_/ /_/        /_/   
#                                                                        
#  Question 1
################################################################################
#
# Instructions:
# The two functions below are used to tell the weather. They have some bugs that
# need to be fixed. The test suite in `question1_test.py` will verify the output.
# Read the test suite to know the values that these functions should return.

def get_city_weather(city):

  sky_condition = None
  temperature = None
  if city == "Quito":
     sky_condition = "sunny"
     temperature = 22
  elif city == "Sao Paulo":
     sky_condition = "cloudy"
     temperature = 17
  elif city == "New York":
     sky_condition = "rainy"
     temperature = 14
  else:
     return "ERROR. It is possible that we don't have weather info for this city or the data you'd provided is wrong."

  return str(temperature) + " degrees and " + sky_condition

# Bugs founded:

# 1. There's no sky condition if for the city Quito. SOLVED
# 2. There's no temperature if for the city New York (It's for San Francisco instead) SOLVED
# 3. New York temperature returns 16 (14 expected). SOLVED
# 4. Program should return a message when the input data is a city that is not in the database or an invalid data. SOLVED
# and new test cases added.
# 5. I think it's better include all in one function, in order to optimize the code.
