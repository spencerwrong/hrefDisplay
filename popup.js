function getAllLinks() {
  var arr = []
  var l = document.links;
  for(var i=0; i<l.length; i++) {
    arr.push(l[i].href);
  }
  return arr;
}

function countLinks(arr) {
  var links = new Array();
  var counts = new Array();
  if(arr.length > 0) {
    for(var i = 0; i < arr.length; i++) {
      var currentLink = arr[i];
      if(!links.includes(currentLink)) {
        links.push(currentLink);
        counts.push(1);
      }
      else {
        for(var j = 0; j < counts.length; j++) {
          if(currentLink == links[j]) {
            counts[j]++;
          }
        }
      }
    }
  }
  arr = [links, counts];
  return arr;
}

function printLinks() {
  var finalArr = countLinks(getAllLinks()); //2x2 array
  for(var i = 0; i < finalArr[0].length; i++) {
    document.write(finalArr[0][i] + ": " + finalArr[1][i] + "<br>");
  }
}