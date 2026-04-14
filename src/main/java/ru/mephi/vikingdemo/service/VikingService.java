package ru.mephi.vikingdemo.service;

import org.springframework.stereotype.Service;
import ru.mephi.vikingdemo.model.Viking;

import java.util.List;
import java.util.*;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class VikingService {
    // каждый раз при изменении создаётся новая копия списка 
    private final CopyOnWriteArrayList<Viking> vikings = new CopyOnWriteArrayList<>();
    private final VikingFactory vikingFactory;
    private final Map<UUID, Viking> storage = new HashMap<>();
    @Autowired
    public VikingService(VikingFactory vikingFactory) {
        this.vikingFactory = vikingFactory;
    }
    
    public List<Viking> findAll() {
        return List.copyOf(vikings);
    }
public List<Viking> findAll() {
    return new ArrayList<>(storage.values());
}
    public Viking addViking(Viking viking) {
    Viking withId = new Viking(
            UUID.randomUUID(),
            viking.name(),
            viking.age(),
            viking.heightCm(),
            viking.hairColor(),
            viking.beardStyle(),
            viking.equipment()
    );

    storage.put(withId.id(), withId);
    return withId;
}
    public Viking createRandomViking() {
    Viking v = factory.createRandomViking();

    Viking withId = new Viking(
            UUID.randomUUID(),
            v.name(),
            v.age(),
            v.heightCm(),
            v.hairColor(),
            v.beardStyle(),
            v.equipment()
    );

    storage.put(withId.id(), withId);
    return withId;
}
    public boolean deleteViking(UUID id) {
    return storage.remove(id) != null;
}
    public Viking updateViking(UUID id, Viking viking) {
    Viking updated = new Viking(
            id,
            viking.name(),
            viking.age(),
            viking.heightCm(),
            viking.hairColor(),
            viking.beardStyle(),
            viking.equipment()
    );

    storage.put(id, updated);
    return updated;
}
}
