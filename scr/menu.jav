function openNav() {
  document.getElementById("mySidenav").style.width = "250px";
  document.getElementById("main").style.marginLeft = "250px";
  document.body.style.backgroundImage = "linear-gradient(to bottom left, rgba(229, 8, 50, 1), rgba(0, 0, 0, 0.4), rgba(8, 81, 158, 1))";
}

function closeNav() {
  document.getElementById("mySidenav").style.width = "0";
  document.getElementById("main").style.marginLeft= "0";
  document.body.style.backgroundImage = "linear-gradient(to bottom left, rgba(229, 8, 50, 1), rgba(0, 0, 0, 0), rgba(8, 81, 158, 1))";
}
