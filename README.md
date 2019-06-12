# Facility-Booking
A facility booking system to book different facilities available in an apartment according to time slots.
There could be multiple facilities such as:
•	Club house
•	Guest house
•	Ballroom
•	Civic center
•	Gym
•	Tennis Court, etc.
User input mentions the facility, date of booking and start time and end time of booking.
The program is implemented using Java. It checks if the facility is already booked for
that particular day and slot. If not, it confirms booking by displaying prices as per the
following rates:-
•	If the slot is between 9am to 1pm, the booking amount is generated as Rs. 200/hour.
•	If the slot is between 6pm to 10pm, the booking amount is generated as Rs. 300/hour.
•	If the start or end time is anything different(different slot), the booking amount  is generated as Rs.100/hour.
 Date entered is validated if it is in the YYYY-MM-DD format. Time entered is validated if
 it is valid in the 24-hour format. 

 Sample Input 
 Club house,2019-02-13,09:00,13:00
 Output:-  Booking Confirmed, Rs.800
 Guest house,2018-11-03,18:00,22:00
 Output:- Booking Confirmed, Rs.1200
 Guest house,2018-11-03,18:00,22:00
 Output:- Already Booked, Booking Failed
 Civic center,2013-02-14,10:00,16:00
 Output:- Booking Confirmed, Rs.600
