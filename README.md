# Facility-Booking
A facility booking system to book different facilities available in an apartment according to time slots.<br/>
There could be multiple facilities such as:<br/><br/>
•	Club house<br/>
•	Guest house<br/>
•	Ballroom<br/>
•	Civic center<br/>
•	Gym<br/>
•	Tennis Court, etc.<br/><br/>
User input mentions the facility, date of booking and start time and end time of booking.
The program is implemented using Java. It checks if the facility is already booked for
that particular day and slot. If not, it confirms booking by displaying prices as per the
following rates:-<br/><br/>
•	If the slot is between 9am to 1pm, the booking amount is generated as Rs. 200/hour.<br/>
•	If the slot is between 6pm to 10pm, the booking amount is generated as Rs. 300/hour.<br/>
•	If the start or end time is anything different(different slot), the booking amount  is generated as Rs.100/hour.<br/>
 Date entered is validated if it is in the YYYY-MM-DD format. Time entered is validated if
 it is valid in the 24-hour format.<br/><br/>

 **Sample Input**<br/><br/>
 Club house,2019-02-13,09:00,13:00<br/>
 **Output:-**  Booking Confirmed, Rs.800<br/><br/>
 Guest house,2018-11-03,18:00,22:00<br/>
 **Output:-** Booking Confirmed, Rs.1200<br/><br/>
 Guest house,2018-11-03,18:00,22:00<br/>
 **Output:-** Already Booked, Booking Failed<br/><br/>
 Civic center,2013-02-14,10:00,16:00<br/>
 **Output:-** Booking Confirmed, Rs.600
