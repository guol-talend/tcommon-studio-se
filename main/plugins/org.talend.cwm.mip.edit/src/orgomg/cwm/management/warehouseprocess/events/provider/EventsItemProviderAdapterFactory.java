/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package orgomg.cwm.management.warehouseprocess.events.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import orgomg.cwm.management.warehouseprocess.events.util.EventsAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EventsItemProviderAdapterFactory extends EventsAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
    /**
     * This keeps track of the root adapter factory that delegates to this adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ComposedAdapterFactory parentAdapterFactory;

    /**
     * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IChangeNotifier changeNotifier = new ChangeNotifier();

    /**
     * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Collection<Object> supportedTypes = new ArrayList<Object>();

    /**
     * This constructs an instance.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EventsItemProviderAdapterFactory() {
        supportedTypes.add(IEditingDomainItemProvider.class);
        supportedTypes.add(IStructuredItemContentProvider.class);
        supportedTypes.add(ITreeItemContentProvider.class);
        supportedTypes.add(IItemLabelProvider.class);
        supportedTypes.add(IItemPropertySource.class);
    }

    /**
     * This keeps track of the one adapter used for all {@link orgomg.cwm.management.warehouseprocess.events.PointInTimeEvent} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PointInTimeEventItemProvider pointInTimeEventItemProvider;

    /**
     * This creates an adapter for a {@link orgomg.cwm.management.warehouseprocess.events.PointInTimeEvent}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createPointInTimeEventAdapter() {
        if (pointInTimeEventItemProvider == null) {
            pointInTimeEventItemProvider = new PointInTimeEventItemProvider(this);
        }

        return pointInTimeEventItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link orgomg.cwm.management.warehouseprocess.events.CustomCalendarEvent} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CustomCalendarEventItemProvider customCalendarEventItemProvider;

    /**
     * This creates an adapter for a {@link orgomg.cwm.management.warehouseprocess.events.CustomCalendarEvent}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createCustomCalendarEventAdapter() {
        if (customCalendarEventItemProvider == null) {
            customCalendarEventItemProvider = new CustomCalendarEventItemProvider(this);
        }

        return customCalendarEventItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link orgomg.cwm.management.warehouseprocess.events.CustomCalendar} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CustomCalendarItemProvider customCalendarItemProvider;

    /**
     * This creates an adapter for a {@link orgomg.cwm.management.warehouseprocess.events.CustomCalendar}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createCustomCalendarAdapter() {
        if (customCalendarItemProvider == null) {
            customCalendarItemProvider = new CustomCalendarItemProvider(this);
        }

        return customCalendarItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link orgomg.cwm.management.warehouseprocess.events.CalendarDate} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CalendarDateItemProvider calendarDateItemProvider;

    /**
     * This creates an adapter for a {@link orgomg.cwm.management.warehouseprocess.events.CalendarDate}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createCalendarDateAdapter() {
        if (calendarDateItemProvider == null) {
            calendarDateItemProvider = new CalendarDateItemProvider(this);
        }

        return calendarDateItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link orgomg.cwm.management.warehouseprocess.events.IntervalEvent} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IntervalEventItemProvider intervalEventItemProvider;

    /**
     * This creates an adapter for a {@link orgomg.cwm.management.warehouseprocess.events.IntervalEvent}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createIntervalEventAdapter() {
        if (intervalEventItemProvider == null) {
            intervalEventItemProvider = new IntervalEventItemProvider(this);
        }

        return intervalEventItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link orgomg.cwm.management.warehouseprocess.events.ExternalEvent} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExternalEventItemProvider externalEventItemProvider;

    /**
     * This creates an adapter for a {@link orgomg.cwm.management.warehouseprocess.events.ExternalEvent}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createExternalEventAdapter() {
        if (externalEventItemProvider == null) {
            externalEventItemProvider = new ExternalEventItemProvider(this);
        }

        return externalEventItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link orgomg.cwm.management.warehouseprocess.events.InternalEvent} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected InternalEventItemProvider internalEventItemProvider;

    /**
     * This creates an adapter for a {@link orgomg.cwm.management.warehouseprocess.events.InternalEvent}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createInternalEventAdapter() {
        if (internalEventItemProvider == null) {
            internalEventItemProvider = new InternalEventItemProvider(this);
        }

        return internalEventItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link orgomg.cwm.management.warehouseprocess.events.CascadeEvent} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CascadeEventItemProvider cascadeEventItemProvider;

    /**
     * This creates an adapter for a {@link orgomg.cwm.management.warehouseprocess.events.CascadeEvent}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createCascadeEventAdapter() {
        if (cascadeEventItemProvider == null) {
            cascadeEventItemProvider = new CascadeEventItemProvider(this);
        }

        return cascadeEventItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link orgomg.cwm.management.warehouseprocess.events.RetryEvent} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RetryEventItemProvider retryEventItemProvider;

    /**
     * This creates an adapter for a {@link orgomg.cwm.management.warehouseprocess.events.RetryEvent}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createRetryEventAdapter() {
        if (retryEventItemProvider == null) {
            retryEventItemProvider = new RetryEventItemProvider(this);
        }

        return retryEventItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link orgomg.cwm.management.warehouseprocess.events.RecurringPointInTimeEvent} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RecurringPointInTimeEventItemProvider recurringPointInTimeEventItemProvider;

    /**
     * This creates an adapter for a {@link orgomg.cwm.management.warehouseprocess.events.RecurringPointInTimeEvent}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createRecurringPointInTimeEventAdapter() {
        if (recurringPointInTimeEventItemProvider == null) {
            recurringPointInTimeEventItemProvider = new RecurringPointInTimeEventItemProvider(this);
        }

        return recurringPointInTimeEventItemProvider;
    }

    /**
     * This returns the root adapter factory that contains this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ComposeableAdapterFactory getRootAdapterFactory() {
        return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
    }

    /**
     * This sets the composed adapter factory that contains this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
        this.parentAdapterFactory = parentAdapterFactory;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object type) {
        return supportedTypes.contains(type) || super.isFactoryForType(type);
    }

    /**
     * This implementation substitutes the factory itself as the key for the adapter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter adapt(Notifier notifier, Object type) {
        return super.adapt(notifier, this);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object adapt(Object object, Object type) {
        if (isFactoryForType(type)) {
            Object adapter = super.adapt(object, type);
            if (!(type instanceof Class) || (((Class<?>)type).isInstance(adapter))) {
                return adapter;
            }
        }

        return null;
    }

    /**
     * This adds a listener.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void addListener(INotifyChangedListener notifyChangedListener) {
        changeNotifier.addListener(notifyChangedListener);
    }

    /**
     * This removes a listener.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void removeListener(INotifyChangedListener notifyChangedListener) {
        changeNotifier.removeListener(notifyChangedListener);
    }

    /**
     * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void fireNotifyChanged(Notification notification) {
        changeNotifier.fireNotifyChanged(notification);

        if (parentAdapterFactory != null) {
            parentAdapterFactory.fireNotifyChanged(notification);
        }
    }

    /**
     * This disposes all of the item providers created by this factory. 
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void dispose() {
        if (pointInTimeEventItemProvider != null) pointInTimeEventItemProvider.dispose();
        if (customCalendarEventItemProvider != null) customCalendarEventItemProvider.dispose();
        if (customCalendarItemProvider != null) customCalendarItemProvider.dispose();
        if (calendarDateItemProvider != null) calendarDateItemProvider.dispose();
        if (intervalEventItemProvider != null) intervalEventItemProvider.dispose();
        if (externalEventItemProvider != null) externalEventItemProvider.dispose();
        if (internalEventItemProvider != null) internalEventItemProvider.dispose();
        if (cascadeEventItemProvider != null) cascadeEventItemProvider.dispose();
        if (retryEventItemProvider != null) retryEventItemProvider.dispose();
        if (recurringPointInTimeEventItemProvider != null) recurringPointInTimeEventItemProvider.dispose();
    }

}