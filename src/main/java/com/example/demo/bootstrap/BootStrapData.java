package com.example.demo.bootstrap;

import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

/*
        OutsourcedPart o= new OutsourcedPart();
        o.setCompanyName("Western Governors University");
        o.setName("out test");
        o.setInv(5);
        o.setPrice(20.0);
        o.setId(100L);
        outsourcedPartRepository.save(o);
        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("out test"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());
*/

        if (partRepository.count() == 0) {
            //first part
            OutsourcedPart o = new OutsourcedPart();
            o.setCompanyName("The Seat Company");
            o.setName("Seat");
            o.setInv(5);
            o.setPrice(40.0);
            o.setId(1);
            o.setMaxInv(5);
            o.setMinInv(0);
            outsourcedPartRepository.save(o);
            OutsourcedPart thePart = null;
            List<OutsourcedPart> outsourcedParts = (List<OutsourcedPart>) outsourcedPartRepository.findAll();
            for (OutsourcedPart part : outsourcedParts) {
                if (part.getName().equals("Seat")) thePart = part;
            }

            System.out.println(thePart.getCompanyName());

            for (OutsourcedPart part : outsourcedParts) {
                System.out.println(part.getName() + " " + part.getCompanyName());
            } // ends for loop

            //second part
            OutsourcedPart p = new OutsourcedPart();
            p.setCompanyName("The Legs Company");
            p.setName("Legs");
            p.setInv(5);
            p.setPrice(30.0);
            p.setId(2);
            p.setMaxInv(5);
            p.setMinInv(0);
            outsourcedPartRepository.save(p);

            for (OutsourcedPart part : outsourcedParts) {
                if (part.getName().equals("Legs")) thePart = part;
            }

            System.out.println(thePart.getCompanyName());

            for (OutsourcedPart part : outsourcedParts) {
                System.out.println(part.getName() + " " + part.getCompanyName());
            } // ends for loop

            //Third part
            OutsourcedPart q = new OutsourcedPart();
            q.setCompanyName("The Arm Rest Company");
            q.setName("Arm Rests");
            q.setInv(5);
            q.setPrice(20.0);
            q.setId(3);
            q.setMaxInv(5);
            q.setMinInv(0);
            outsourcedPartRepository.save(q);

            for (OutsourcedPart part : outsourcedParts) {
                if (part.getName().equals("Arm Rests")) thePart = part;
            }

            System.out.println(thePart.getCompanyName());

            for (OutsourcedPart part : outsourcedParts) {
                System.out.println(part.getName() + " " + part.getCompanyName());
            } // ends for loop

            //Fourth part
            OutsourcedPart r = new OutsourcedPart();
            r.setCompanyName("The Back Rest Company");
            r.setName("Back Rest");
            r.setInv(5);
            r.setPrice(80.0);
            r.setId(4);
            r.setMaxInv(5);
            r.setMinInv(0);
            outsourcedPartRepository.save(r);

            for (OutsourcedPart part : outsourcedParts) {
                if (part.getName().equals("Back Rest")) thePart = part;
            }

            System.out.println(thePart.getCompanyName());

            for (OutsourcedPart part : outsourcedParts) {
                System.out.println(part.getName() + " " + part.getCompanyName());
            } // ends for loop

            //Fifth part
            OutsourcedPart s = new OutsourcedPart();
            s.setCompanyName("The Head Rest Company");
            s.setName("Head Rest");
            s.setInv(5);
            s.setPrice(60.0);
            s.setId(5);
            s.setMaxInv(5);
            s.setMinInv(0);
            outsourcedPartRepository.save(s);

            for (OutsourcedPart part : outsourcedParts) {
                if (part.getName().equals("Head Rest")) thePart = part;
            }

            System.out.println(thePart.getCompanyName());

            for (OutsourcedPart part : outsourcedParts) {
                System.out.println(part.getName() + " " + part.getCompanyName());
            } // ends for loop

        } //ends if statement
/*
        Product bicycle= new Product("bicycle",100.0,15);
        Product unicycle= new Product("unicycle",100.0,15);
        productRepository.save(bicycle);
        productRepository.save(unicycle);
*/
     if(productRepository.count() == 0){
        Product dinnerChair = new Product("Dinner Chair", 200.0, 5);
        Product officeChairWArms = new Product("Office Chair With Arms", 400.0, 5);
        Product officeChair = new Product("Office Chair", 350, 5);
        Product gamingChair = new Product("Gaming Chair", 500.0, 5);
        Product stool = new Product("Stool", 250.00, 5);
        productRepository.save(dinnerChair);
        productRepository.save(officeChairWArms);
        productRepository.save(officeChair);
        productRepository.save(gamingChair);
        productRepository.save(stool);
    }//ends if statement
        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
