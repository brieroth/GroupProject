<template>
    <div id="nav" >
      <nav class="navbar navbar-inverse">
        <div class="container-fluid">
          <div class="navbar-header">
            <li><router-link to="/"><a class="navbar-brand" href="#">QA Cinema</a></router-link></li>
          </div>
          <ul class="nav navbar-nav" style="font-size: medium;" >
            <li class="navbar-center"><router-link to="/"><a href="#">Home</a></router-link></li>
            <li ><router-link to="/listing"><a href="#">Listings Gallery</a></router-link></li>
            <li><router-link to="/opening"><a href="#">Opening Times </a></router-link></li>
            <li><router-link to="/newlisting"><a href="#">New Release Listings </a></router-link></li>
            <li><router-link to="/classification"><a href="#">Classification </a></router-link></li>
            <li><router-link to="/booking"><a href="#">Ticket Booking </a></router-link></li>
            <li><router-link to="/login"><a href="#"><i class="fa fa-fw fa-user" ></i> Login</a></router-link></li>
            <li><router-link to="/login"><a href="#"><i class="fa fa-fw fa-user-plus" ></i> SignUp</a></router-link></li>
          </ul>
        </div>
      </nav>
    </div>
</template>

<script>
export default {
  name: 'navigation'
}

</script>

<style scoped>
  ul {
    list-style-type: none;
    margin: 0;
    padding: 0%;
    overflow: hidden;
  }
  li {
    float: left;
  }
  li a {
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
    color: white;
  }
  li a:hover {
    background-color: #111;
  }
</style>
