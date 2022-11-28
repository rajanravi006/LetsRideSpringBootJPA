# LetsRideSpringBootJPA
# LetsRideSpringBootJPA

Project Description

There will be 2 persons one is a Rider and the other is an Asset Transportation Requester (will be referred as requester from now on). 
A Rider is a person who travels from one place to another and is willing to carry some assets(packages/luggages) along with him. 
A Requester is a person who wants his assets to be carried by someone else from one place to another. 


#API Endpoints

1.PostMapping("/postrequest")- Enter the details to create a request.
  example- 1. http://localhost:8080/postrequest
           2. Enter JSON data and SEND:
                    {
        "requestId": 7,
        "requesterId": 1,
        "source": "delhi",
        "destination": "kanpur",
        "dateTime": "28/10/2022, 11:20 PM",
        "asset": {
            "assetId": 6,
            "sensitivity": "Normal",
            "assetTypes": "Pakage",
            "quantity": 50,
            "status": "Pending"
        }
    }
  
 2.GetMapping("/getrequest")- Get all the request details. (Doesn't support pagination)
 
 3.GetMapping("/getrequestdetails/{requestId}")- Get all the request by requesterId which is a unique ID for each user.(Supports pagination and default sort by requestId)
 example- http://localhost:8080/getrequestdetails/1?pageNumber=0&pageSize=5&sortBy=dateTime
 
 4.PostMapping("/postrider")- Post rider details.(To be posted by rider itself)
 
 5.GetMapping("/getrider")- Get all the rider details.
