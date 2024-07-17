    package com.uts.zoo.controllers;

    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.PathVariable;
    import org.springframework.web.bind.annotation.PostMapping;
    import org.springframework.web.bind.annotation.RequestBody;
    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.bind.annotation.RestController;

    import com.uts.zoo.respositories.entities.AnimalEntity;
    import com.uts.zoo.respositories.entities.HabitatEntity;
    import com.uts.zoo.respositories.entities.ZooEntity;
    import com.uts.zoo.services.AnimalService;
    import com.uts.zoo.services.HabitatService;
    import com.uts.zoo.services.ZooService;

    @RestController
    @RequestMapping("/zoo")
    public class ZooControllers {

        @Autowired
        private ZooService zooService;

        @Autowired
        private AnimalService animalService;

        @Autowired
        private HabitatService habitatService;

        @GetMapping("/{id}")
        public ZooEntity findById(@PathVariable Long id){

            return zooService.findById(id);

        }

        @PostMapping("/{idZoo}/{idEspecie}")
        public AnimalEntity save(@PathVariable Long idZoo,@PathVariable Long idEspecie,@RequestBody AnimalEntity animal){

            return animalService.save(animal, idZoo, idEspecie);

        }

        @PostMapping("/habitat/{idZoo}")
        public HabitatEntity saveH(@PathVariable Long idZoo, @RequestBody HabitatEntity habitat){
            return habitatService.save(habitat, idZoo);
        }
        
    }
