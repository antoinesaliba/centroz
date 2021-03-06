package com.project.csc480.osubustracker;

import android.content.Context;

import com.google.android.gms.maps.model.LatLng;


import java.util.ArrayList;

/**
 * Created by antoinesaliba on 2/25/15.
 */
public class BusRoute {

    Vehicle vehicle;
    String routeName;
    ArrayList<BusStop> busStops = new ArrayList<BusStop>();
    ArrayList<LatLng> routePoints = new ArrayList<LatLng>();

    int routeColor;
    LatLng centralPoint;
    float routeZoom;

    public BusRoute(String routeName){
        this.routeName = routeName;
        this.vehicle = new Vehicle(routeName);
    }

    public String getRouteName() {
        return routeName;
    }

    public ArrayList<BusStop> getBusStops() {
        return busStops;
    }

    public ArrayList<LatLng> getRoutePoints() {
        return routePoints;
    }

    public void setRoutePoints(ArrayList<LatLng> routePoints) {
        this.routePoints = routePoints;
    }

    public void setBusStops(ArrayList<BusStop> busStops) {
        this.busStops = busStops;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    public void loadRoute(){
        loadBusStops();
        loadRoutePoints();
    }

    public int getBusStopIndex(String busStopName) {
        for(int i = 0; i < this.getBusStops().size(); i++) {
            if(this.getBusStops().get(i).getName().equals(busStopName)) {
                return i;
            }
        }
        return -1;
    }

    public void loadBusStops(){

        if(routeName.equals("blueRoute")) {
            //BLUE ROUTE BUS STOPS
            busStops.add(new BusStop("Campus Center", new LatLng(43.453838, -76.540628),new LatLng(43.4539526, -76.5405475), 1, "Shineman"));
            busStops.add(new BusStop("Mackin", new LatLng(43.454804, -76.53475284576416),new LatLng(43.4549406, -76.5348609), 2, "Campus Center"));
            busStops.add(new BusStop("Johnson", new LatLng(43.45713231914716, -76.53761744499207),new LatLng(43.4571612, -76.5372736), 3, "Mackin"));
            busStops.add(new BusStop("Library -> Village", new LatLng(43.45436628708711, -76.54450535774231),new LatLng(43.454331, -76.5434586), 4, "Mary Walker"));
            busStops.add(new BusStop("Mary Walker", new LatLng(43.455475, -76.542743),new LatLng(43.4554639, -76.5424972), 5, "Waterbury"));
            busStops.add(new BusStop("Shineman", new LatLng(43.454282, -76.539160),new LatLng(43.4548819, -76.5390339), 6, "Waterbury"));
            busStops.add(new BusStop("Village", new LatLng(43.44699935247679, -76.54906511306763),new LatLng(43.4469709, -76.5488651), 7, "Oneida"));
            busStops.add(new BusStop("Oneida", new LatLng(43.44964763983892, -76.55072271823883),new LatLng(43.44964763983892, -76.55072271823883), 8, "Rudolph Road Stop(Cayuga)"));
            busStops.add(new BusStop("Rudolph Road Stop(Cayuga)", new LatLng(43.45140790787459, -76.54988050460815),new LatLng(43.45140790787459, -76.54988050460815), 9, "Oneida"));
            busStops.add(new BusStop("Rudolph Road Stop", new LatLng(43.45266966140318, -76.54818534851074),new LatLng(43.45266966140318, -76.54818534851074), 10, "Rudolph Road Stop(Cayuga)"));
            busStops.add(new BusStop("Library -> Campus Center", new LatLng(43.45430522865038, -76.543599),new LatLng(43.45430522865038, -76.543599), 12, "Library -> Village"));
            busStops.add(new BusStop("Waterbury", new LatLng(43.45654432636253, -76.54002070426941),new LatLng(43.45654432636253, -76.54002070426941), 13, "Mary Walker"));



        }
        else if(routeName.equals("greenRoute")) {
            //GREEN ROUTE BUS STOPS
            busStops.add(new BusStop("Campus Center", new LatLng(43.453838, -76.540628),new LatLng(43.453838, -76.540628), 14, ""));
            busStops.add(new BusStop("Romney", new LatLng(43.447918, -76.534195),new LatLng(43.447918, -76.534195), 15, ""));
            busStops.add(new BusStop("Laker", new LatLng(43.446368, -76.53462409973145),new LatLng(43.446368, -76.53462409973145), 16, ""));
            busStops.add(new BusStop("Laker", new LatLng(43.44528569298516, -76.53571844100952),new LatLng(43.44528569298516, -76.53571844100952), 17, ""));



        }
        else if(routeName.equals("walmart1A")) {
            //GREEN ROUTE BUS STOPS
            busStops.add(new BusStop("Campus Center", new LatLng(43.453838, -76.540628),new LatLng(43.453838, -76.540628), 18, ""));
            busStops.add(new BusStop("Downtown", new LatLng(43.456607, -76.511054),new LatLng(43.456607, -76.511054), 19, ""));
        }
        else if(routeName.equals("walmart1B")) {
            //GREEN ROUTE BUS STOPS
            busStops.add(new BusStop("Campus Center", new LatLng(43.453838, -76.540628),new LatLng(43.453838, -76.540628), 18, ""));
            busStops.add(new BusStop("Downtown", new LatLng(43.456607, -76.511054),new LatLng(43.456607, -76.511054), 19, ""));
        }
    }

    public void loadRoutePoints() {

        if(routeName.equals("blueRoute")) {
            //BLUE ROUTE HIGHLIGHTING
            routePoints.add(new LatLng(43.453838, -76.540628)); // CAMPUS_CENTER // Origin
            routePoints.add(new LatLng(43.453838, -76.540628)); // CAMPUS_CENTER // Destination
            routePoints.add(new LatLng(43.453523, -76.541181)); // CIRCLE
            routePoints.add(new LatLng(43.457295865792744, -76.53929114341736)); // RIGGS_HALL
            routePoints.add(new LatLng(43.450535, -76.549731)); // ONONDAGA
            routePoints.add(new LatLng(43.44699935247679, -76.54906511306763)); // VILLAGE
            routePoints.add(new LatLng(43.454309, -76.543996)); // PENFIELD_LIBRARY
            routePoints.add(new LatLng(43.454282, -76.539160)); // SHINEMAN

            routeColor = App.getContext().getResources().getColor(R.color.route_color_blue) ;
            centralPoint = new LatLng(43.453838, -76.541928);
            routeZoom = (float) 14.5;

        } else if(routeName.equals("greenRoute")) {
            //GREEN ROUTE HIGHLIGHTING
            routePoints.add(new LatLng(43.453838, -76.540628)); // CAMPUS_CENTER
            routePoints.add(new LatLng(43.453838, -76.540628)); // CAMPUS_CENTER
            routePoints.add(new LatLng(43.446368, -76.53462409973145)); //LAKER
            routePoints.add(new LatLng(43.44528569298516, -76.53548240661621)); //LAKER2
            routePoints.add(new LatLng(43.44598674137218, -76.53653383255005)); //LAKER3
            routePoints.add(new LatLng(43.44676567449565, -76.53561115264893)); //LAKER4
            routePoints.add(new LatLng(43.4462048436578, -76.53455972671509)); //LAKER5
            routePoints.add(new LatLng(43.44531685086377, -76.53541803359985)); //LAKER6
            routePoints.add(new LatLng(43.447918, -76.534195)); //ROMNEY
            routePoints.add(new LatLng(43.45357312306545, -76.53239250183105)); //FIFTHAVE




            routeColor = App.getContext().getResources().getColor(R.color.route_color_green) ;
            centralPoint = new LatLng(43.447918, -76.534195);
            routeZoom = (float) 14.5;


        } else if(routeName.equals("walmart1A")) {
            //GREEN ROUTE HIGHLIGHTING
            routePoints.add(new LatLng(43.453838, -76.540628)); // CAMPUS_CENTER
            routePoints.add(new LatLng(43.464295, -76.479034)); // Walmart
            routePoints.add(new LatLng(43.456607, -76.511054)); //Downtown BusStop




            routeColor = App.getContext().getResources().getColor(R.color.route_color_1a) ;
            centralPoint = new LatLng(43.456607, -76.511054);
            routeZoom = (float) 12.8;


        }
        else if(routeName.equals("walmart1B")) {
            //GREEN ROUTE HIGHLIGHTING
            routePoints.add(new LatLng(43.453838, -76.540628)); // CAMPUS_CENTER
            routePoints.add(new LatLng(43.464295, -76.479034)); // Walmart
            routePoints.add(new LatLng(43.459077, -76.512668)); // Corner W Seneca St and W 1st St
            routePoints.add(new LatLng(43.456607, -76.511054)); //Downtown BusStop




            routeColor = App.getContext().getResources().getColor(R.color.route_color_1a) ;
            centralPoint = new LatLng(43.456607, -76.511054);
            routeZoom = (float) 12.8;


        }
        else {
            //return error
        }
    }
}
