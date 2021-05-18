package com.example.todo.Repository.Impl;

import com.example.todo.Core.service.impl.CoreCRUDServiceImpl;
import com.example.todo.Model.Entity.LabelEntity;
import com.example.todo.Repository.LabelRepository;

public class LabelRepositoryImpl extends CoreCRUDServiceImpl<LabelEntity> implements LabelRepository {

    @Override
    protected void updateCore(LabelEntity persistedEntity, LabelEntity entity) {
        persistedEntity.setName(entity.getName());
        persistedEntity.setTask(entity.getTask());
    }

    @Override
    protected Class<LabelEntity> getManagedClass() {
        return LabelEntity.class;
    }

}