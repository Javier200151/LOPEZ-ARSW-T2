app = (function (){

    var _module = "js/api.js";
    var map;


    function _updateData(data){
        $("#lblname").text("City: "+data.name);
        $("#lblid").text("Id: "+data.id);
        $("#lbltimezone").text("Timezone: "+data.timezone);
        $("#lbldt").text("Dt: "+data.dt);
        $("#lblclouds").text("Clouds: "+data.clouds.all);
        $("#lblvisibility").text("Visibility: "+data.visibility);
        $("#lblbase").text("Base: "+data.base);
        $("#lbllat").text("Lat: "+data.coord.lat);
        $("#lbllon").text("Lon: "+data.coord.lon);
        $("#lblwid").text("Id: "+data.weather.id);
        $("#lblmain").text("Main: "+data.weather.main);
        $("#lbldescrp").text("Description: "+data.weather.description);
        $("#lblicon").text("Icon: "+data.weather.icon);
        $("#lbltemp").text("Temp: "+data.main.temp);
        $("#lblfeels").text("Feels like: "+data.main.feels_like);
        $("#lbltmpmin").text("Temp min: "+data.main.temp_min);
        $("#lbltmpmax").text("Temp max: "+data.main.temp_max);
        $("#lblpress").text("Pressure: "+data.main.pressure);
        $("#lblhumed").text("Humidity: "+data.main.humidity);
        $("#lblspeed").text("Speed: "+data.wind.speed);
        $("#lbldeg").text("Deg: "+data.wind.deg);
        $("#lbltype").text("Type: "+data.sys.type);
        $("#lblSYSid").text("Id: "+data.sys.id);
        $("#lblcountry").text("Country: "+data.sys.country);
        $("#lblsunrise").text("Sunrise: "+data.sys.sunrise);
        $("#lblsunset").text("Sunset: "+data.sys.sunset);
        document.getElementById("infow").style.visibility="visible";
        _initMap(data)
    }

    var markers;
    var bounds;

    function _initMap(data){
        map = new google.maps.Map(document.getElementById('map'), {
            center: {lat: data.coord.lat, lng: data.coord.lon},
            zoom: 10
        });
        plotMarkers(data);
    }

    function plotMarkers(m){
        markers = [];
        bounds = new google.maps.LatLngBounds();

        m.forEach(function (marker) {
            var position = new google.maps.LatLng(marker.coord.lat, marker.coord.lng);

            markers.push(
                new google.maps.Marker({
                    position: position,
                    map: map,
                    animation: google.maps.Animation.DROP
                })
            );

            bounds.extend(position);
        });

        map.fitBounds(bounds);
    }

    return {
        conectWeatherByCity: function (city) {
            $.getScript(_module, function () {
                api.conectWeatherByCity(city, _updateData);
            });
        }
    }

})();