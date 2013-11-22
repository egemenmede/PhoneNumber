var PhoneNumber = { 
    getNumber: function (success, fail, result) { 
      return cordova.exec( success, fail, 
                           "PhoneNumber", 
                           "phoneNumber", [result]);
    } 
};