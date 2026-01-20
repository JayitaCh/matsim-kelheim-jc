package org.matsim.run;

// import org.geotools.xml.xsi.XSISimpleTypes.String;
import org.matsim.api.core.v01.Id;
import org.matsim.api.core.v01.network.Link;
import org.matsim.core.network.NetworkUtils;

public class RemoveHighway {

    public static void main(String[] args) {

        // Use a utils class to load the file
        var network = NetworkUtils.readNetwork("E:/MATSIM/matsim_repo/input/kelheim-v3.0-1pct.output_network.xml.gz");
        
        // Change something like specifying some conditions
        for ( Link link : network.getLinks().values()) {
            if (link.getId().equals(Id.createLinkId("322183374"))||link.getId().equals(Id.createLinkId("322186089"))){
                link.setFreespeed(10.);
            }                    
        }

        // Use a utils class to Write the changes into a file
        NetworkUtils.writeNetwork(network, "E:/MATSIM/matsim_repo/input/kelheim-output-tutorial.xml.gz");
    }

}
