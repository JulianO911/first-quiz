from question1 import get_city_weather

def test_get_city_weather():

  assert get_city_weather("Quito") == "22 degrees and sunny"

  assert get_city_weather("New York") == "14 degrees and rainy"

def test_city_that_is_not_in_database():
  assert get_city_weather("San Francisco") == "ERROR. It is possible that we don't have weather info for this city or the data you'd provided is wrong."

def test_wrong_information():
  assert get_city_weather(2) == "ERROR. It is possible that we don't have weather info for this city or the data you'd provided is wrong."
