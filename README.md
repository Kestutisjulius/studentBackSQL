# studentBackSQL
demo for CRUD + H2 SQL with IntelliJ

get All students - http://localhost:8080/api/
get All universities - http://localhost:8080/universities/
get student By ID - http://localhost:8080/api/{id}
get student By Name - http://localhost:8080/api/name/{name}
get student By Surname - http://localhost:8080/api/surname/{surname}
add student to database - http://localhost:8080/api/
                                                        ...json format:
                                                                              {
                                                                                  "name": "James",
                                                                                  "last_name": "Adams",
                                                                                  "imageUrl": "https://bootdey.com/img/Content/avatar/avatar2.png",
                                                                                  "university": {
                                                                                      "id": 2,
                                                                                      "name": "Kaunas University of Technology",
                                                                                      "address": "K. Donelaičio St. 73, 44249 Kaunas, Lithuania"
                                                                                  }
                                                                              }
 update/edit student by id- http://localhost:8080/api/
                                                        ...json format - id required
______________________________________________________________________________________
 delete student by id- http://localhost:8080/api/{id} 
                                                                              
